-- 1. 모든 사원에 대하여 사원번호, 사원이름, 부서코드, 부서명을 검색하시오 (사원이름 오름차순 정렬할 것)
    select e.empno, e.ename, d.deptno, d.dname
    from emp e, dept d
    where e.deptno = d.deptno
    order by e.ename asc;

-- 2. 급여가 2500 이상이고, 업무(job)가 MANAGER인 사원에 대하여 사원번호, 사원이름, 업무, 급여, 부서명을 검색하시오.
    select e.empno, e.ename, e.job, e.sal, d.dname
    from emp e, dept d
    where e.deptno = d.deptno and e.job = 'MANAGER';

-- 3. 급여등급이 4인 사원에 대하여 사원번호, 사원이름, 급여, 등급을 검색하시오.
--    단, 등급은 급여가 하한값과 상한값 범위에 포함되는 것으로 판단하며, 급여를 기준으로 내림차순 정렬하시오,
    select e.empno, e.ename, e.sal, s.grade
    from emp e, salgrade s
    where e.sal between s.losal and s.hisal and s.grade = 4 order by e.sal desc;
    
    select * from salgrade;

-- 4. 모든 사원에 대하여 사원의 이름과 해당 사원의 관리자(MGR) 이름을 검색하시오.
    select e.ename, m.ename
    from emp e left outer join emp m 
    on (e.mgr = m.empno);

-- 5. 30번 부서에서 일하는 사원들에 대하여 부서번호, 부서명, 사원이름을 출력하시오.
    select d.deptno, d.dname, e.ename
    from emp e, dept d
    where e.deptno = d.deptno
    and d.deptno = '30';
    
-- 6. 커미션을 받는 사원의 이름, 커미션, 부서이름을 출력하시오.
    select e.ename, e.comm, d.dname
    from emp e, dept d
    where e.deptno = d.deptno
    and comm is not null;

-- 7. 커미션과 급여의 합이 1,600 이상인 사원의 사원이름, 부서명, 근무지, 연봉(sal), 커미션을 출력하시오.
    select e.ename, d.dname, d.loc, e.sal*12 연봉, e.comm
    from emp e, dept d
    where e.deptno = d.deptno
    and e.comm+e.sal > 1600;
    

-- 8. 자신의 관리자보다 연봉(sal)을 많이 받는 사원의 이름과 연봉을 출력하시오.
    select e.ename, e.sal*12
    from emp e, emp m
    where e.mgr = m.empno
    and e.sal*12 > m.sal*12;

-- 9. 각 부서별로 1982년 이전에 입사한 직원들의 인원수를 출력하시오.
    select d.dname, count(*)
    from emp e join dept d
    using(deptno)
    where e.hiredate < '82/01/01'
    group by d.dname
    order by dname desc;

-- 10. 근무지별로 근무하는 사원의 수가 5명 이하인 경우, 인원이 적은 도시순으로 정렬하시오.
--     단, 부서명, 지역, 인원수를 출력하고 0명인 부서는 제외하시오.
    
    select d.dname,d.loc,count(*) from emp e join dept d
    using(deptno)
    group by d.dname,d.loc having count(*) <= 5
    order by count(*) asc;
    
    select * from dept;
    select * from emp;

-- 서브쿼리 (11 ~ 15)

-- 11. 'SCOTT'의 월급과 같은 월급을 받는 사원의 이름과 월급을 출력하시오.
--     단, SCOTT은 검색 결과에서 제외하시오.

    select e.ename, e.sal from emp e where e.sal = 3000 and e.ename not in ('SCOTT');


-- 12. CLARK 보다 급여가 많은 사원들의 사원번호, 사원이름, 급여를 검색하시오.


-- 13. JONES 보다 일찍 입사한 사원의 사원번호, 사원이름, 입사일을 검색하시오.


-- 14. 부서별 최대 급여를 받는 사원들과 같은 급여를 받는 사원의 사원번호, 사원이름, 부서코드, 급여를 검색하시오.
--     단, 부서번호별로 오름차순 정렬하시오.


-- 15. salgrade가 7등급인 사원들의 평균 급여보다 적게 받는 사원들의 모든 정보를 검색하시오.