# Write your MySQL query statement below

-- select Max(salary) as SecondHighestSalary from Employee where salary < ( select Max(salary) from employee);

SELECT (
    SELECT DISTINCT salary
    FROM Employee
    ORDER BY salary DESC
    LIMIT 1 OFFSET 1
) AS SecondHighestSalary;