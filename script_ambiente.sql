CREATE TABLESPACE 'biblioteca_tsp' LOGGING
	DATAFILE 'biblioteca.ora' SIZE 2M
	REUSE AUTOEXTEND ON
	NEXT 1280K MAXSIZE 32767M EXTENT MANAGEMENT LOCAL
	UNIFORM SIZE 96K SEGMENT SPACE MANAGEMENT AUTO;
/
show errors;

create user biblioteca 
  identified by biblioteca
  default tablespace biblioteca_tsp;
/
show errors;

grant all privileges to biblioteca;
/
show errors;