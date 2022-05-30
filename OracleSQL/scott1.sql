select * from tab;
select * from emp;
select * from dept;
select * from salgrade;

-- 오라클 조인 방식으로 풀 것
-- 1. 직업이 analyst인 사원의 이름과 근무지, 직업을 출력하시오.
    select e.empno,e.ename,e.job,e.mgr,m.empno mgrno,m.ename mgr_name,m.job mgr_job from emp e, emp m where e.mgr = m.empno(+);
    select e.ename,d.loc,e.job from emp e join dept d on(e.deptno = d.deptno) where lower(job) = 'analyst';
    select e.ename,d.loc,e.job from emp e join dept d using(deptno) where lower(job) = 'analyst';
    select e.ename,d.loc,e.job from emp e natural join dept d where lower(job) = 'analyst';


-- 2. 사원테이블과 급여등급테이블을 조인하여 이름, 월급, 급여 등급을 출력 하시오.
    select e.ename,e.sal,s.grade from emp e, salgrade s where e.sal between  s.losal and s.hisal;


-- 3. 사원 테이블과 부서 근무 테이블을 조인하여 이름과 부서위치를 출력하시오
-- 단 근무지에 근무하는 사원이 없어도 부서의 모든 위치를 함께 출력
    select e.ename,d.loc from emp e, dept d where e.deptno(+) = d.deptno;


-- 4. 사원테이블 자기 자신의 테이블과 조인하여 이름, 직업, 해당 사원의 관리자 이름, 관리자 직업을 출력하시오
    select e.ename,e.job,m.ename mgr_name,m.job mgr_job from emp e, emp m where e.mgr = m.empno(+);

-- ANSI 조인
    select e.ename, d.loc, e.job
    from emp e, dept d
    where e.deptno = d.deptno and e.job = 'ANALYST';

-- 1. ON 절
    select e.ename, d.loc, e.job
    from emp e join dept d
    on e.deptno = d.deptno
    where e.job = 'ANALYST';

-- 2. USING 절
-- 공통된 속성이 있을 때 사용
    select e.ename, d.loc, e.job
    from emp e join dept d
    using (deptno)
    where e.job = 'ANALYST';
    
-- 3. NATURAL JOIN
    select e.ename, d.loc, e.job
    from emp e NATURAL JOIN dept d
    where e.job = 'ANALYST';
    
-- 서브쿼리 (SUBQUERY)
    
-- 1. JONES보다 더 많은 월급을 받는 사원들의 이름과 월급을 구하시오.
    select ename, sal from emp where sal > (select sal from emp where ename = 'JONES');


-- 2. SCOTT의 월급과 같은 월급을 받는 사원의 이름과 월급을 출력하시오 / SCOTT 제외
    select ename, sal from emp where sal = (select sal from emp where lower(ename) = 'scott') and lower(ename) != 'scott';
    select ename, sal from emp where sal = 3000;

-- 3. 직업이 SALESMAN인 사원들과 같은 월급을 받는 사원들의 이름과 월급을 출력하시오.


-- 4. 관리자(MANAGER)가 아닌 사원들의 이름, 월급, 직업을 출력하시오.


-- 5. 부서 테이블에 있는 부서 번호 중에서 사원 테이블에도 존재하는 부서 번호의 부서번호, 부서명, 부서위치를 출력하시오.


