DECLARE
  
    -- Cursor to fetch customer balance
    CURSOR customer_cursor IS

        SELECT customer_id, balance
        FROM customer;

BEGIN
  
    FOR cust IN customer_cursor
    LOOP

        IF cust.balance > 10000 THEN
            UPDATE customer
            SET isVIP = 'TRUE'
            WHERE customer_id = cust.customer_id;

            DBMS_OUTPUT.PUT_LINE(
                'Customer ID '
                || cust.customer_id
                || ' promoted to VIP'
            );

        END IF;
    END LOOP;
    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'VIP customer update completed'
    );

EXCEPTION

    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE(
            'Error: ' || SQLERRM
        );
        ROLLBACK;
END;
/
