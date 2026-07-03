DECLARE
  
    -- Cursor fetching upcoming loan payments
    CURSOR loan_cursor IS

        SELECT c.customer_name,l.loan_id,l.due_date
        FROM customer c
        JOIN loan l
        ON c.customer_id = l.customer_id
        WHERE l.due_date
        BETWEEN SYSDATE
        AND SYSDATE + 30;

BEGIN

    FOR loan_record IN loan_cursor
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder sent to customer: '
            || loan_record.customer_name
            || ' for Loan ID: '
            || loan_record.loan_id
            || ' due date: '
            || loan_record.due_date
        );

    END LOOP;

EXCEPTION

    WHEN OTHERS THEN

        DBMS_OUTPUT.PUT_LINE(
            'Error: ' || SQLERRM
        );

END;
/
