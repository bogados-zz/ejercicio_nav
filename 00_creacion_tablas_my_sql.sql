create schema ejercicio_navent;
commit;

use ejercicio_navent;
create table PEDIDO(
ID_PEDIDO int auto_increment,
nombre varchar(50),
monto double not null default 0,
descuento float not null default 0,
constraint PK_ID_PEDIDO primary key (ID_PEDIDO)
);
commit;


select * from PEDIDO;

/*
	Punto 2:
    En caso de necesitar realizar una mayor performance respecto a las consultas,
    crearía un indice no cluster sobre el atributo monto (En este caso debería hacer uso de criterias con hibernate),
    pero también existe otro metodo para aumentar la performance, y esa forma sería
    particionar la tabla de forma Horizontal. 
    

*/