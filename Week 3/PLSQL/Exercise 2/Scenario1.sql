CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN

    -- Apply 1% interest to all Savings accounts
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE Account_Type = 'Savings';

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Monthly interest processed successfully.');

EXCEPTION

    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error while processing monthly interest: ' || SQLERRM);

END ProcessMonthlyInterest;
/
