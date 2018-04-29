<h1>JDBC Toolkit Repository</h1>
<b>A JavaFX, openJPA, JDBCtoolkit with MVC architecture</b>
<br>
<p>This repository contains basic elements to build Java Database Connectivity applications with Model-View-Controller software architecture.  Connections are currently made to Derby Databases, and persisted using the openJPA object-relational mapping solution.  Front end is supported by JavaFX GUI application framework.</p>


<p><b>Dependencies:</b></p>
<p>* Java 8</p>
<p>* derby.jar</p>
<p>* openjpa-all-2.3.0.jar</p>

<p><b>Building the Local Derby Database</b></p>
<p>ij> CONNECT 'jdbc:derby:simpledb;create=true';</p>
<p>ij> create table simplerecord (id int not null generated always as identity, fname varchar(50), lname varchar(50), email varchar(50));<p>
<p>ij> insert into simplerecord (fname,lname,email) values ('Rochelle','Barrett','rocbar@email.com');</p>
<p>ij> insert into simplerecord (fname,lname,email) values ('Becky','Jones','becjon@email.com');</p>
<p>ij> insert into simplerecord (fname,lname,email) values ('Beth','Silva','betsil@email.com');</p>

</p>SimpleDriver.java performs a select statement from a derby database displays records to console</p>
