#JDBC Toolkit Repository


Dependencies:
Java 8
derby.jar
openjpa-all-2.3.0.jar

Building the Local Derby Database
ij> CONNECT 'jdbc:derby:simpledb;create=true';
ij> create table simplerecord (id int not null generated always as identity, fname varchar(50), lname varchar(50), email varchar(50));
ij> insert into simplerecord (fname,lname,email) values ('Rochelle','Barrett','rocbar@email.com');
ij> insert into simplerecord (fname,lname,email) values ('Becky','Jones','becjon@email.com');
ij> insert into simplerecord (fname,lname,email) values ('Beth','Silva','betsil@email.com');

SimpleDriver.java performs a select statement from a derby database displays records to console



