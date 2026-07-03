CREATE OR REPLACE PROCEDURE TransferFunds
(
    p_FromAccount IN NUMBER,
    p_ToAccount   IN NUMBER,
    p_Amount      IN NUMBER
)
IS
    v_Balance Accounts.Balance%TYPE;

BEGIN

    -- Retrieve balance of source account
    SELECT Balance
    INTO v_Balance
    FROM Accounts
    WHERE Account_ID = p_FromAccount;

    -- Check whether sufficient balance exists
    IF v_Balance >= p_Amount THEN

        -- Deduct amount from source account
        UPDATE Accounts
        SET Balance = Balance - p_Amount
        WHERE Account_ID = p_FromAccount;

        -- Credit amount to destination account
        UPDATE Accounts
        SET Balance = Balance + p_Amount
        WHERE Account_ID = p_ToAccount;

        COMMIT;

        DBMS_OUTPUT.PUT_LINE('Funds transferred successfully.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Transfer failed. Insufficient balance.');
    END IF;

EXCEPTION

    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Source account not found.');
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error while transferring funds: ' || SQLERRM);
END TransferFunds;
/
