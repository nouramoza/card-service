insert into person (id, first_name, last_name, national_code, phone_number,  home_address) 
values (101, 'Noura', 'Mozafari', '2064865391', '09113149630', 'Tehran, Majidie');

insert into person (id, first_name, last_name, national_code, phone_number,  home_address) 
values (102, 'Ali', 'Rahimi', '7726019092', '09358371020', 'Tehran');

insert into person (id, first_name, last_name, national_code, phone_number,  home_address) 
values (103, 'Zahra', 'Ahmadi', '8372098371', '09330902983', 'Ahwaz');

insert into person (id, first_name, last_name, national_code, phone_number,  home_address) 
values (104, 'Hasan', 'Rezaee', '9802736251', '09358548790', 'Iran');

insert into person (id, first_name, last_name, national_code, phone_number,  home_address) 
values (105, 'Hoda', 'Salehi', '0093871019', '09127362817', 'Tehran');

insert into person (id, first_name, last_name, national_code, phone_number,  home_address) 
values (106, 'Hamid', 'Aghaee', '8729182032', '09359340909', 'Tehran');


----------Account------------
insert into account (id, account_number, balance, is_active, person_id) 
values (201, '3762909092', 1000, 1, 101);

insert into account (id, account_number, balance, is_active, person_id) 
values (202, '3620198454', 1500, 1, 101);

insert into account (id, account_number, balance, is_active, person_id) 
values (203, '8373621982', 1700, 1, 102);

insert into account (id, account_number, balance, is_active, person_id) 
values (204, '7362948574', 2000, 1, 103);

insert into account (id, account_number, balance, is_active, person_id) 
values (205, '4938372617', 500, 1, 104);


--------------Card----------------
insert into card (id, account_id, card_number, card_type, expire_date, is_active, issuer_code, issuer_name)
values(301, 202, '6280231451904303', 1, '202305', 1, 121111, 'Markazi');

insert into card (id, account_id, card_number, card_type, expire_date, is_active, issuer_code, issuer_name)
values(302, 202, '6280231451904123', 0	, '202305', 0, 121111, 'Markazi');

insert into card (id, account_id, card_number, card_type, expire_date, is_active, issuer_code, issuer_name)
values(303, 202, '6280231487654567', 0	, '202105', 1, 121111, 'Markazi');















