create database MascoTika;
Use MascoTika;

create table Usuario(
	NombreUsuario varchar(50),
	Contraseña varchar(100),
	Rol varchar(30) check(Rol in('Administrador', 'Veterinario', 'Cliente')),
	Correo varchar(50),
	primary key(NombreUsuario)
);

create table Veterinario(
	IDVeterinario int not null,
	NombreVeterinario varchar(50),
	Calificacion int,	
	Correo varchar(50),
	SitioWeb varchar(50),
	Distrito varchar(20),
	Canton varchar(20),
	Provincia varchar(30),
	Señas varchar(200),
	UGoogleMaps int,
	Estado varchar(20) check(Estado in('Activo', 'Inactivo')),
	NombreUsuario varchar(50),
	primary key(IDVeterinario),
	foreign key(NombreUsuario) references Usuario(NombreUsuario)
);

create table Procedimientos_Servicios(
	IDProcedimiento_Servicio int identity(1,1) not null,
	NombreProcedimiento varchar(30),
	Descripcion varchar(200),
	Tipo varchar(30),
	MontoUnitario int,
	MontoServicioDomicilio int,
	IDCategoria int,
	NombreUsuario varchar(50),
	primary key(IDProcedimiento_Servicio),
	foreign key(IDCategoria) references CategoriaServicio_Procedimiento(IDCategoria),
	foreign key(NombreUsuario) references Usuario(NombreUsuario)
);

create table CategoriaServicio_Procedimiento(
	IDCategoria int identity(1,1) not null,
	NombreCategoria varchar(30),
	Descripcion varchar(100),
	Estado varchar(30) check(Estado in('Activo', 'Inactivo')),
	primary key(IDCategoria)
);


create table Cliente(
	CedulaCliente int not null,
	NombreCliente varchar(50),
	Contraseña varchar(50),
	Provincia varchar(30),
	Canton varchar(30),
	Distrito varchar(30),
	Señas varchar(200),
	NombreUsuario varchar(50),
	Correo varchar(50),
	UGoogleMaps int,
	primary key(CedulaCliente),
	foreign key(NombreUsuario) references Usuario(NombreUsuario),
);

create table CitasMedicas(
	IDCita int identity(1,1) not null,
	Fecha date,
	Domicilio varchar(40),
	NombreUsuario varchar(50),
	IDProcedimiento_Servicio int,
	Estado varchar(40) check(Estado in('Realizada','Pendiente', 'Asignada', 'Cancelada por el Cliente','Cancelada por el Veterinario')),
	numFactura int,
	CedulaCliente int not null,
	usuarioCliente varchar(50),
	primary key(IDCita),
	foreign key(IDProcedimiento_Servicio) references Procedimientos_Servicios(IDProcedimiento_Servicio),
	foreign key(CedulaCliente) references Cliente(CedulaCliente),
	foreign key(NombreUsuario) references Usuario(NombreUsuario)
);

create table Paciente(
	IDPaciente int identity(1,1) not null,
	NombrePaciente varchar(50),
	Raza varchar(20),
	FechaNacimiento varchar(30),
	CedulaCliente int not null,
	primary key(IDPaciente),
	foreign key(CedulaCliente) references Cliente(CedulaCliente)
);

create table HistorialPacientes(
	IDPaciente int not null,
	Tipo varchar(30),
	Diagnostico varchar(100),
	Domicilio varchar(20),
	Monto int,
	Descripcion varchar(100),
	Tratamientos varchar(100),
	FechaRealizacion date,
	IDCita int,
	usuarioVeterinario varchar(100),
	foreign key(IDPaciente) references Paciente(IDPaciente),
);

create table HorariosAtencion_Veterinario(
	IDVeterinario int not null,
	Dia varchar(100),
	HoraInicio varchar(100),
	HoraFinal varchar(100),
	primary key(IDVeterinario,Dia),
	foreign key(IDVeterinario) references Veterinario(IDVeterinario)
);

create table RedesSociales_Veterinario(
	IDVeterinario int not null,
	RedSocial varchar(100),
	UsuarioRedSocial varchar(20),
	primary key(IDVeterinario, RedSocial, UsuarioRedSocial),
	foreign key(IDVeterinario) references Veterinario(IDVeterinario)
);

create table TelefonoVeterinario(
	IDVeterinario int,
	Telefono int,
	primary key(IDVeterinario, Telefono),
	foreign key(IDVeterinario) references Veterinario(IDVeterinario)
);

create table TelefonoCliente(
	CedulaCliente int,
	Telefono int,
	primary key(CedulaCliente, Telefono),
	foreign key(CedulaCliente) references Cliente(CedulaCliente)
);