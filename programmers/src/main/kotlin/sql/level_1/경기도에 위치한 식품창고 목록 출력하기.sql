SELECT warehouse_id, warehouse_name, address, IFNULL(freezer_yn, "N")
FROM food_warehouse
WHERE address like '%경기도%'