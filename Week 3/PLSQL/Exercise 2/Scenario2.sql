CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus
(
    p_DepartmentID IN NUMBER,
    p_BonusPercent IN NUMBER
)
IS
BEGIN

    -- Update salary by adding the bonus percentage
    UPDATE Employees
    SET Salary = Salary + (Salary * p_BonusPercent / 100)
    WHERE Department_ID = p_DepartmentID;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Employee bonus updated successfully.');

EXCEPTION

    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error while updating employee bonus: ' || SQLERRM);

END UpdateEmployeeBonus;
/
