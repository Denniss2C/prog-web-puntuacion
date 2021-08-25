INSERT INTO `jueces`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `desde`, `licencia`) VALUES ("Arkano","0550049688",20,"Español","Luis Valverde","2010-08-01","Valida");
INSERT INTO `jueces`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `desde`, `licencia`)  VALUES ("Mac","0550049712",21,"Ecuatoriana","Luis Caisa","2019-08-08","Valida");
INSERT INTO `jueces`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `desde`, `licencia`)  VALUES ("Aczino","171558698",33,"Mexicano","Luis Rios","2010-07-01","Valida");
INSERT INTO `jueces`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `desde`, `licencia`)  VALUES ("Kapo","0515261598",28,"Español","Dennis Valverde","2010-08-01","Caducada");
INSERT INTO `jueces`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `desde`, `licencia`) VALUES ("Chuty","2032156984",20,"Español","Luis Valdivieso","2010-08-01","Valida");
INSERT INTO `jueces`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `desde`, `licencia`)  VALUES ("Forty","0102030405",21,"Ecuatoriana","Byron Armas","2019-08-08","Valida");
INSERT INTO `jueces`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `desde`, `licencia`)  VALUES ("Loquillo","1152648251",33,"Colombiano","Luis Flores","2010-07-01","Valida");
INSERT INTO `jueces`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `desde`, `licencia`)  VALUES ("Bnet","2145124587",28,"Español","Javier Loaiza","2010-08-01","Caducada");
INSERT INTO `jueces`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `desde`, `licencia`) VALUES ("Gazir","1717181952",20,"Español","Gabriel Lopez","2010-08-01","Valida");
INSERT INTO `jueces`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `desde`, `licencia`)  VALUES ("Stuart","0550014511",21,"Argentino","Lucas Armas","2019-08-08","Valida");

INSERT INTO `equipos`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `integrantes`) VALUES ("Papo","0550014511",31,"Argentino","Team Argentina",2);
INSERT INTO `equipos`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `integrantes`) VALUES ("Mecha","0550014511",21,"Argentino","Team Argentina",2);
INSERT INTO `equipos`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `integrantes`) VALUES ("Jazze","0550014511",21,"Peruano","Team Peru",2);
INSERT INTO `equipos`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `integrantes`) VALUES ("Neckros","0550014511",21,"Peruano","Team Peru",2);
INSERT INTO `equipos`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `integrantes`) VALUES ("Valles-T","0550014511",21,"Colombiano","Team Colombia",2);
INSERT INTO `equipos`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `integrantes`) VALUES ("Filosofo","0550014511",21,"Colombiano","Team Colombia",2);
INSERT INTO `equipos`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `integrantes`) VALUES ("Mnak","0550014511",21,"Español","Team España",2);
INSERT INTO `equipos`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `integrantes`) VALUES ("Kan","0550014511",21,"Español","Team España",2);
INSERT INTO `equipos`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `integrantes`) VALUES ("Skiper","0550014511",21,"Mexicano","Team Mexico",2);
INSERT INTO `equipos`(`aka`, `cedula`, `edad`, `nacionalidad`, `nombre`, `integrantes`) VALUES ("Garza","0550014511",21,"Mexicano","Team Mexico",2);

INSERT INTO `actividades`(`descripcion`, `fecha`, `promedio`, `tipo`, `id_equipo`) VALUES ("Flow","2021-08-10",17,"4*4",1);
INSERT INTO `actividades`(`descripcion`, `fecha`, `promedio`, `tipo`, `id_equipo`) VALUES ("Metrica","2021-08-10",18,"Libre",2);
INSERT INTO `actividades`(`descripcion`, `fecha`, `promedio`, `tipo`, `id_equipo`) VALUES ("Puesta en Esena","2021-08-10",19,"Tematica",3);
INSERT INTO `actividades`(`descripcion`, `fecha`, `promedio`, `tipo`, `id_equipo`) VALUES ("Metrica","2021-08-10",17,"Delux",4);
INSERT INTO `actividades`(`descripcion`, `fecha`, `promedio`, `tipo`, `id_equipo`) VALUES ("Doble Tempo","2021-08-10",10,"Easy Mode",5);
INSERT INTO `actividades`(`descripcion`, `fecha`, `promedio`, `tipo`, `id_equipo`) VALUES ("Flow","2021-08-10",15,"Hard Mode",6);
INSERT INTO `actividades`(`descripcion`, `fecha`, `promedio`, `tipo`, `id_equipo`) VALUES ("Doble Tempo","2021-08-10",10,"4*4",7);
INSERT INTO `actividades`(`descripcion`, `fecha`, `promedio`, `tipo`, `id_equipo`) VALUES ("Puesta en Esena","2021-08-10",18,"Tematica",8);
INSERT INTO `actividades`(`descripcion`, `fecha`, `promedio`, `tipo`, `id_equipo`) VALUES ("Flow","2021-08-10",14,"Libre",9);
INSERT INTO `actividades`(`descripcion`, `fecha`, `promedio`, `tipo`, `id_equipo`) VALUES ("Metrica","2021-08-10",13,"Delux",10);

INSERT INTO `calificaciones`(`observacion`, `puntaje`, `id_actividad`, `id_juez`) VALUES ("perfecto",4,1,1);
INSERT INTO `calificaciones`(`observacion`, `puntaje`, `id_actividad`, `id_juez`) VALUES ("falta de coerencia",3,2,2);
INSERT INTO `calificaciones`(`observacion`, `puntaje`, `id_actividad`, `id_juez`) VALUES ("mucho relleno",2,3,3);
INSERT INTO `calificaciones`(`observacion`, `puntaje`, `id_actividad`, `id_juez`) VALUES ("muchas trabadas",1,4,4);
INSERT INTO `calificaciones`(`observacion`, `puntaje`, `id_actividad`, `id_juez`) VALUES ("preparadas",1,5,5);
INSERT INTO `calificaciones`(`observacion`, `puntaje`, `id_actividad`, `id_juez`) VALUES ("no se le entiende todo",2,6,6);
INSERT INTO `calificaciones`(`observacion`, `puntaje`, `id_actividad`, `id_juez`) VALUES ("falto de fluidez",3,7,7);
INSERT INTO `calificaciones`(`observacion`, `puntaje`, `id_actividad`, `id_juez`) VALUES ("Bien hecho",4,8,8);
INSERT INTO `calificaciones`(`observacion`, `puntaje`, `id_actividad`, `id_juez`) VALUES ("falta mucho",1,9,9);
INSERT INTO `calificaciones`(`observacion`, `puntaje`, `id_actividad`, `id_juez`) VALUES ("casi bueno",3,10,10);

