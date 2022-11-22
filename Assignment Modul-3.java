SELECT DISTINCT job FROM employee;
SELECT * FROM  employee ORDER BY deptno ASC , job DESC
SELECT DISTINCT job FROM employee ORDER BY job DESC
SELECT * FROM employee WHERE hiredate < ('1981-1-1')
SELECT empno, ename, sal, sal/30, 12*sal annsal FROM employee ORDER BY annsal ASC
SELECT empno, ename, sal, sal-comm EXP FROM employee WHERE mgr=7369;
SELECT * FROM employee WHERE comm>sal
SELECT * FROM employee WHERE job='clerk' OR job='analyst' ORDER BY job DESC
SELECT * FROM employee WHERE 12*sal BETWEEN 22000 AND 45000;
SELECT * FROM employee WHERE ename LIKE 's%' AND LENGTH(ename)=5;
SELECT * FROM employee WHERE empno NOT LIKE '78%';
SELECT * FROM employee WHERE job='clerk' AND deptno=20 

SELECT * FROM employee WHERE deptno=20 AND job IN(SELECT job FROM employee WHERE deptno=10); 
SELECT * FROM employee WHERE sal IN (SELECT sal FROM employee WHERE ename='smith' OR ename='ford'ORDER BY sal DESC);
SELECT * FROM employee WHERE job IN (SELECT job FROM employee WHERE ename='allen' OR ename='smith');
SELECT job FROM employee WHERE deptno=10 AND job NOT IN (SELECT job FROM employee WHERE deptno=20);
SELECT MAX(sal) FROM employee
SELECT * FROM employee WHERE sal IN(SELECT MAX(Sal) FROM employee);
SELECT SUM(sal) FROM employee WHERE job='manager';
SELECT * FROM employee WHERE ename LIKE '%a%'
SELECT ename, job, MIN(sal) FROM employee GROUP BY job ASC
SELECT * FROM employee WHERE sal>(SELECT sal FROM employee WHERE ename='blake');
ALTER TABLE student MODIFY sname VARCHAR(40);