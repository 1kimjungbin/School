-- 제약조건
-- 사용자가 원하는 조건의 데이터만 유지하기 위한 방법
-- 테이블의 특정 컬럼에 설정하는 제약

-- 1. 기본키

-- 기본키를 설정하는 인라인 방식
create table primary_test (
    student_id number(10) primary key,
    name varchar2(20)
);

-- 기본키를 설정하는 아웃라인 방식
create table primary_test2 (
    student_id number(10) not null,
    name varchar2(20),
    constraint stu_pk primary key(student_id)
);

drop table primary_test;

create table primary_test (
    student_id number(10),
    name varchar2(20)
);

-- 기존 테이블에 기본키를 추가하는 방식
alter table primary_test
add constraint student_pk primary key(student_id);

-- 2. UNIQUE KEY (고유키)
-- 테이블에 저장된 행 데이터를 고유하게 식별하기 위한 키
-- NULL은 고유키 제약의 대상이 아님

CREATE TABLE unique_test (
col1 varchar2(20) unique not null,
col2 varchar2(20) unique,
col3 varchar2(20) not null,
col4 varchar2(20) not null,
constraint temp_unique unique(col3, col4)
);

insert into unique_test
values('aa','bb','cc','dd');

-- col1의 unique 조건에 위배됨.
insert into unique_test
values('aa','bb2','cc2','dd2');

insert into unique_test
values('aa2','bb2','cc2','dd2');

insert into unique_test
values('aa3','bb3','cc2','dd3');

insert into unique_test
values('aa4','bb4','cc3','dd2');

insert into unique_test
values('aa5','bb5','cc3','dd3');

insert into unique_test
values('aa6','bb6','cc3','dd3');

update unique_test
set col1 = 'aa'
where col2 = 'bb2';

-- 3. not null
create table null_test (
    col1 varchar2(20) not null,
    col2 varchar2(20) null,
    col3 varchar2(20)
);

insert into null_test(col1, col2)
values('aa','bb');

-- col1이 not null 제약조건을 가지고 있기 때문에 오류가 발생한다.
insert into null_test(col2, col3)
values('cc','dd');

insert into null_test(col1, col3)
values('ee','ff');

-- 4. CHECK
-- 입력할 수 있는 값의 범위 등을 제한
-- CHECK 제약으로는 TRUE or FALSE로 평가할 수 있는 논리식을 지정해야한다.

create table check_test(
    gender varchar2(10) not null
    constraint check_gender check (gender in('남자', '여자')),
    salary number(4)
    CONSTRAINT check_salary check(salary < 9000)
);

insert into check_test(gender) values('남자');
insert into check_test(gender) values('여');

insert into check_test values('여자', '7777');
insert into check_test values('여자', '11111');

-- 5. 외래키 (FOREIGN KEY)
create table departments (
    dept_id number(4) primary key,
    dept_name varchar2(10)
);

-- 인라인
create table foreign_key (
    dept_id constraint dept_fk references departments(dept_id)
);

-- 아웃라인
create table foreign_key2 (
    dept_id, constraint dept_fk2 foreign key(dept_id) references departments(dept_id)
);

-- 6. defalut
-- 해당 필드의 기본값을 설정
-- 데이터를 입력할 때 컬럼의 값이 지정되지 않으면 자동으로 입력될 기본값을 설정

create table dept_kor (
deptno number(1) primary key,
deptname varchar2(10),
loc varchar2(15) default '서울'
);

insert into dept_kor(deptno, deptname) values(1, '마케팅');
insert into dept_kor(deptno, deptname) values(2, '개발');
insert into dept_kor(deptno, deptname, loc) values(3, '인사', '성남');

select * from dept_kor;

create table department (
    dno number(1) not null primary key,
    dname varchar2(10),
    loc varchar2(15),
    constraint check_loc check(loc in('1','2','3','4'))
);

create table employee (
    empno number(4) not null,
    empname varchar2(15) not null,
    title varchar2(9),
    manager number(4),
    salary number(7),
    hire_date date,
    dno number(1) default 1,
    constraint empno_pk primary key(empno),
    constraint dept_fk foreign key(dno) references department(dno),
    constraint manager_fk foreign key(manager) references employee(empno),
    constraint dno2 check (dno in(1,2,3,4)),
    constraint title default '사원',
    constraint sal_check check (salary < 6000000)
);

