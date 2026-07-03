DECLARE

    -- Cursor to fetch all customers
    CURSOR customer_cursor IS
        SELECT customer_id, age
        FROM customer;

BEGIN

    -- Loop through each customer
    FOR cust IN customer_cursor
    LOOP

        -- Check customer age
        IF cust.age > 60 THEN

            -- Reduce loan interest rate by 1%
            UPDATE loan
            SET interest_rate = interest_rate - 1
            WHERE customer_id = cust.customer_id;

            DBMS_OUTPUT.PUT_LINE(
                '1% interest discount applied for customer ID: '
                || cust.customer_id
            );

        END IF;
    END LOOP;
    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'Senior citizen discount process completed'
    );

EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE(
            'Error occurred: ' || SQLERRM
        );
        ROLLBACK;
END;
/
