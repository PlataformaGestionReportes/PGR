/*
SQLyog Enterprise - MySQL GUI v8.05 
MySQL - 5.5.28-log : Database - sysinfo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`sysinfo` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `sysinfo`;

/*Table structure for table `actividad` */

CREATE TABLE `actividad` (
  `idActividad` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `estado` varchar(255) NOT NULL,
  `memorando` varchar(255) NOT NULL,
  PRIMARY KEY (`idActividad`),
  KEY `FK_actividad` (`memorando`),
  KEY `FK_actividadestado` (`estado`),
  CONSTRAINT `FK_actividad` FOREIGN KEY (`memorando`) REFERENCES `memorando` (`idMemorando`),
  CONSTRAINT `FK_actividadestado` FOREIGN KEY (`estado`) REFERENCES `estadoactividad` (`idEstadoActividad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `actividad` */

LOCK TABLES `actividad` WRITE;

UNLOCK TABLES;

/*Table structure for table `actor` */

CREATE TABLE `actor` (
  `idActor` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idActor`),
  CONSTRAINT `FK_actorq` FOREIGN KEY (`idActor`) REFERENCES `quien` (`idQuien`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `actor` */

LOCK TABLES `actor` WRITE;

UNLOCK TABLES;

/*Table structure for table `actorrol` */

CREATE TABLE `actorrol` (
  `idRolActor` varchar(255) NOT NULL,
  `actor` varchar(255) NOT NULL,
  `rol` varchar(255) NOT NULL,
  PRIMARY KEY (`idRolActor`),
  KEY `FK_actor` (`actor`),
  KEY `FK_rolac` (`rol`),
  CONSTRAINT `FK_actor` FOREIGN KEY (`actor`) REFERENCES `actor` (`idActor`),
  CONSTRAINT `FK_rolac` FOREIGN KEY (`rol`) REFERENCES `rol` (`idRol`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `actorrol` */

LOCK TABLES `actorrol` WRITE;

UNLOCK TABLES;

/*Table structure for table `agenda` */

CREATE TABLE `agenda` (
  `idAgenda` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idAgenda`),
  CONSTRAINT `FK_paquete` FOREIGN KEY (`idAgenda`) REFERENCES `paquete` (`idPaquete`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `agenda` */

LOCK TABLES `agenda` WRITE;

UNLOCK TABLES;

/*Table structure for table `anexo` */

CREATE TABLE `anexo` (
  `idAnexo` varchar(255) NOT NULL,
  `ruta` varchar(255) DEFAULT NULL,
  `documento` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idAnexo`),
  KEY `FK_anexo` (`documento`),
  CONSTRAINT `FK_anexo` FOREIGN KEY (`documento`) REFERENCES `documento` (`idDocumento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `anexo` */

LOCK TABLES `anexo` WRITE;

UNLOCK TABLES;

/*Table structure for table `armario` */

CREATE TABLE `armario` (
  `idArmario` varchar(255) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  PRIMARY KEY (`idArmario`),
  CONSTRAINT `FK_armario` FOREIGN KEY (`idArmario`) REFERENCES `deposito` (`idDeposito`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `armario` */

LOCK TABLES `armario` WRITE;

UNLOCK TABLES;

/*Table structure for table `autordocumento` */

CREATE TABLE `autordocumento` (
  `idAutorDoc` varchar(255) NOT NULL,
  `actor` varchar(255) NOT NULL,
  `documento` varchar(255) NOT NULL,
  `descripcionModificacion` varchar(255) NOT NULL,
  PRIMARY KEY (`idAutorDoc`),
  KEY `FK_autordoc` (`actor`),
  KEY `FK_autordocumento` (`documento`),
  CONSTRAINT `FK_autordoc` FOREIGN KEY (`actor`) REFERENCES `actor` (`idActor`),
  CONSTRAINT `FK_autordocumento` FOREIGN KEY (`documento`) REFERENCES `documento` (`idDocumento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `autordocumento` */

LOCK TABLES `autordocumento` WRITE;

UNLOCK TABLES;

/*Table structure for table `calendario` */

CREATE TABLE `calendario` (
  `idCalendario` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `calendario` varchar(255) DEFAULT NULL,
  `agenda` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idCalendario`),
  KEY `FK_calendario` (`calendario`),
  KEY `FK_agenda` (`agenda`),
  CONSTRAINT `FK_agenda` FOREIGN KEY (`agenda`) REFERENCES `agenda` (`idAgenda`),
  CONSTRAINT `FK_calendario` FOREIGN KEY (`calendario`) REFERENCES `calendario` (`idCalendario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `calendario` */

LOCK TABLES `calendario` WRITE;

UNLOCK TABLES;

/*Table structure for table `circular` */

CREATE TABLE `circular` (
  `idCircular` varchar(255) NOT NULL,
  `numeroRadicado` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idCircular`),
  CONSTRAINT `FK_circular` FOREIGN KEY (`idCircular`) REFERENCES `comunicacion` (`idComunicacion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `circular` */

LOCK TABLES `circular` WRITE;


UNLOCK TABLES;

/*Table structure for table `ciudad` */

CREATE TABLE `ciudad` (
  `idCiudad` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  PRIMARY KEY (`idCiudad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ciudad` */

LOCK TABLES `ciudad` WRITE;


UNLOCK TABLES;

/*Table structure for table `comunciacioninterna` */

CREATE TABLE `comunciacioninterna` (
  `idComunicacionI` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idComunicacionI`),
  CONSTRAINT `FK_comunciacioninterna` FOREIGN KEY (`idComunicacionI`) REFERENCES `comunicacion` (`idComunicacion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `comunciacioninterna` */

LOCK TABLES `comunciacioninterna` WRITE;



UNLOCK TABLES;

/*Table structure for table `comunicacion` */

CREATE TABLE `comunicacion` (
  `idComunicacion` varchar(255) NOT NULL,
  `asunto` varchar(255) DEFAULT NULL,
  `contenidoCom` text,
  `estado` varchar(255) NOT NULL,
  `remitente` varchar(255) NOT NULL,
  `fecha` varchar(255) DEFAULT NULL,
  `leido` varchar(2) NOT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `unidadOrganizacional` varchar(255) DEFAULT NULL,
  `destinatariosCom` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`idComunicacion`),
  KEY `FK_comunicacioncontacto` (`remitente`),
  KEY `FK_comunicacionf` (`fecha`),
  KEY `FK_comunicacionestado` (`estado`),
  CONSTRAINT `FK_comunicacioncontacto` FOREIGN KEY (`remitente`) REFERENCES `contacto` (`idContacto`),
  CONSTRAINT `FK_comunicaciondoc` FOREIGN KEY (`idComunicacion`) REFERENCES `documento` (`idDocumento`),
  CONSTRAINT `FK_comunicacionestado` FOREIGN KEY (`estado`) REFERENCES `estadocomunicacion` (`idEstadoComunicacion`),
  CONSTRAINT `FK_comunicacionf` FOREIGN KEY (`fecha`) REFERENCES `fecha` (`idFecha`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `comunicacion` */

LOCK TABLES `comunicacion` WRITE;


UNLOCK TABLES;

/*Table structure for table `comunicaciondestinatario` */

CREATE TABLE `comunicaciondestinatario` (
  `idComunicacionDestinatario` varchar(255) NOT NULL,
  `comunicacion` varchar(255) NOT NULL,
  `destinatario` varchar(255) DEFAULT NULL,
  `cc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idComunicacionDestinatario`),
  KEY `FK_comunicacion` (`comunicacion`),
  KEY `FK_destinatario` (`destinatario`),
  CONSTRAINT `FK_comunicacion` FOREIGN KEY (`comunicacion`) REFERENCES `comunicacion` (`idComunicacion`),
  CONSTRAINT `FK_destinatario` FOREIGN KEY (`destinatario`) REFERENCES `contacto` (`idContacto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `comunicaciondestinatario` */

LOCK TABLES `comunicaciondestinatario` WRITE;

UNLOCK TABLES;

/*Table structure for table `contacto` */

CREATE TABLE `contacto` (
  `idContacto` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `directorio` varchar(255) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idContacto`),
  KEY `FK_contacto` (`directorio`),
  KEY `FK_contactod` (`direccion`),
  CONSTRAINT `FK_contacto` FOREIGN KEY (`directorio`) REFERENCES `directorio` (`idDirectorio`),
  CONSTRAINT `FK_contactod` FOREIGN KEY (`direccion`) REFERENCES `direccion` (`id_direccion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `contacto` */

LOCK TABLES `contacto` WRITE;

UNLOCK TABLES;

/*Table structure for table `contactoquien` */

CREATE TABLE `contactoquien` (
  `idContactoQuien` varchar(255) NOT NULL,
  `contacto` varchar(255) NOT NULL,
  `quien` varchar(255) NOT NULL,
  PRIMARY KEY (`idContactoQuien`),
  KEY `FK_contactoq` (`contacto`),
  KEY `FK_quienc` (`quien`),
  CONSTRAINT `FK_contactoq` FOREIGN KEY (`contacto`) REFERENCES `contacto` (`idContacto`),
  CONSTRAINT `FK_quienc` FOREIGN KEY (`quien`) REFERENCES `quien` (`idQuien`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `contactoquien` */

LOCK TABLES `contactoquien` WRITE;

UNLOCK TABLES;

/*Table structure for table `contenido` */

CREATE TABLE `contenido` (
  `idContenido` varchar(255) NOT NULL,
  `item` varchar(255) NOT NULL,
  `documento` varchar(255) NOT NULL,
  PRIMARY KEY (`idContenido`),
  KEY `FK_contenido` (`documento`),
  CONSTRAINT `FK_contenido` FOREIGN KEY (`documento`) REFERENCES `documento` (`idDocumento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `contenido` */

LOCK TABLES `contenido` WRITE;

UNLOCK TABLES;

/*Table structure for table `conversacion` */

CREATE TABLE `conversacion` (
  `idConversacion` varchar(255) NOT NULL,
  `comunicacion` varchar(255) DEFAULT NULL,
  `nombreContacto` varchar(255) DEFAULT NULL,
  `asunto` varchar(255) DEFAULT NULL,
  `fechaConversacion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idConversacion`),
  KEY `FK_conversacion` (`comunicacion`),
  CONSTRAINT `FK_conversacion` FOREIGN KEY (`comunicacion`) REFERENCES `comunicacion` (`idComunicacion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `conversacion` */

LOCK TABLES `conversacion` WRITE;

UNLOCK TABLES;

/*Table structure for table `copia` */

CREATE TABLE `copia` (
  `idCopia` varchar(255) NOT NULL,
  `formato` varchar(255) NOT NULL,
  `producto` varchar(255) NOT NULL,
  `deposito` varchar(255) NOT NULL,
  PRIMARY KEY (`idCopia`),
  KEY `FK_copiad` (`deposito`),
  KEY `FK_copiap` (`producto`),
  CONSTRAINT `FK_copiad` FOREIGN KEY (`deposito`) REFERENCES `deposito` (`idDeposito`),
  CONSTRAINT `FK_copiap` FOREIGN KEY (`producto`) REFERENCES `producto` (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `copia` */

LOCK TABLES `copia` WRITE;

UNLOCK TABLES;

/*Table structure for table `deposito` */

CREATE TABLE `deposito` (
  `idDeposito` varchar(255) NOT NULL,
  `unidadOrganizacional` varchar(255) NOT NULL,
  `deposito` varchar(255) NOT NULL,
  PRIMARY KEY (`idDeposito`),
  KEY `FK_deposito` (`deposito`),
  KEY `FK_dunidadorg` (`unidadOrganizacional`),
  CONSTRAINT `FK_deposito` FOREIGN KEY (`deposito`) REFERENCES `deposito` (`idDeposito`),
  CONSTRAINT `FK_dunidadorg` FOREIGN KEY (`unidadOrganizacional`) REFERENCES `unidadorganizacional` (`idUnidadOrganizacional`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `deposito` */

LOCK TABLES `deposito` WRITE;

UNLOCK TABLES;

/*Table structure for table `direccion` */

CREATE TABLE `direccion` (
  `id_direccion` varchar(255) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `ciudad` varchar(255) NOT NULL,
  PRIMARY KEY (`id_direccion`),
  KEY `FK_ciudad` (`ciudad`),
  CONSTRAINT `FK_ciudad` FOREIGN KEY (`ciudad`) REFERENCES `ciudad` (`idCiudad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `direccion` */

LOCK TABLES `direccion` WRITE;

UNLOCK TABLES;

/*Table structure for table `directorio` */

CREATE TABLE `directorio` (
  `idDirectorio` varchar(255) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  PRIMARY KEY (`idDirectorio`),
  CONSTRAINT `FK_directorio` FOREIGN KEY (`idDirectorio`) REFERENCES `paquete` (`idPaquete`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `directorio` */

LOCK TABLES `directorio` WRITE;

UNLOCK TABLES;

/*Table structure for table `disco` */

CREATE TABLE `disco` (
  `idDisco` varchar(255) NOT NULL,
  `referencia` varchar(255) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  PRIMARY KEY (`idDisco`),
  CONSTRAINT `FK_disco` FOREIGN KEY (`idDisco`) REFERENCES `deposito` (`idDeposito`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `disco` */

LOCK TABLES `disco` WRITE;

UNLOCK TABLES;

/*Table structure for table `documento` */

CREATE TABLE `documento` (
  `idDocumento` varchar(255) NOT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `edicion` varchar(255) DEFAULT NULL,
  `vigencia` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `documentobase` varchar(255) DEFAULT NULL,
  `orientacion` varchar(255) DEFAULT NULL,
  `tipoDocumento` varchar(255) DEFAULT NULL,
  `tabladeretenciondocumental` varchar(255) DEFAULT NULL,
  `fechaCreacion` varchar(255) DEFAULT NULL,
  `anexo` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `comentarios` text,
  PRIMARY KEY (`idDocumento`),
  KEY `FK_documentobase` (`documentobase`),
  KEY `FK_documentoori` (`orientacion`),
  KEY `FK_documentotipo` (`tipoDocumento`),
  KEY `FK_documentotablar` (`tabladeretenciondocumental`),
  CONSTRAINT `FK_documentobase` FOREIGN KEY (`documentobase`) REFERENCES `documento` (`idDocumento`),
  CONSTRAINT `FK_documentoori` FOREIGN KEY (`orientacion`) REFERENCES `orientacion` (`idOrientacion`),
  CONSTRAINT `FK_documentotablar` FOREIGN KEY (`tabladeretenciondocumental`) REFERENCES `tablaretenciondocumental` (`idTabla`),
  CONSTRAINT `FK_documentotipo` FOREIGN KEY (`tipoDocumento`) REFERENCES `tipodocumento` (`idTipoDoc`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `documento` */

LOCK TABLES `documento` WRITE;

UNLOCK TABLES;

/*Table structure for table `edificio` */

CREATE TABLE `edificio` (
  `idEdificio` varchar(255) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  PRIMARY KEY (`idEdificio`),
  KEY `FK_direccion` (`direccion`),
  CONSTRAINT `FK_direccion` FOREIGN KEY (`direccion`) REFERENCES `direccion` (`id_direccion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `edificio` */

LOCK TABLES `edificio` WRITE;

UNLOCK TABLES;

/*Table structure for table `estadoactividad` */

CREATE TABLE `estadoactividad` (
  `idEstadoActividad` varchar(255) NOT NULL,
  `estado` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idEstadoActividad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `estadoactividad` */

LOCK TABLES `estadoactividad` WRITE;

UNLOCK TABLES;

/*Table structure for table `estadocomunicacion` */

CREATE TABLE `estadocomunicacion` (
  `idEstadoComunicacion` varchar(255) NOT NULL,
  `estado` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idEstadoComunicacion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `estadocomunicacion` */

LOCK TABLES `estadocomunicacion` WRITE;

UNLOCK TABLES;

/*Table structure for table `expediente` */

CREATE TABLE `expediente` (
  `idExpediente` varchar(255) NOT NULL,
  `asunto` varchar(255) DEFAULT NULL,
  `fechaCreacion` varchar(255) DEFAULT NULL,
  `expediente` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idExpediente`),
  KEY `FK_expedienteE` (`expediente`),
  CONSTRAINT `FK_expedienteE` FOREIGN KEY (`expediente`) REFERENCES `expediente` (`idExpediente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `expediente` */

LOCK TABLES `expediente` WRITE;

UNLOCK TABLES;

/*Table structure for table `expedientedocumento` */

CREATE TABLE `expedientedocumento` (
  `idExpDoc` varchar(255) NOT NULL,
  `expediente` varchar(255) DEFAULT NULL,
  `documento` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idExpDoc`),
  KEY `FK_expediente` (`expediente`),
  KEY `FK_expedientedocumento` (`documento`),
  CONSTRAINT `FK_expediente` FOREIGN KEY (`expediente`) REFERENCES `expediente` (`idExpediente`),
  CONSTRAINT `FK_expedientedocumento` FOREIGN KEY (`documento`) REFERENCES `documento` (`idDocumento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `expedientedocumento` */

LOCK TABLES `expedientedocumento` WRITE;

UNLOCK TABLES;

/*Table structure for table `fecha` */

CREATE TABLE `fecha` (
  `idFecha` varchar(255) NOT NULL,
  `dia` varchar(4) NOT NULL,
  `mes` varchar(20) NOT NULL,
  `anio` varchar(4) NOT NULL,
  PRIMARY KEY (`idFecha`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `fecha` */

LOCK TABLES `fecha` WRITE;

UNLOCK TABLES;

/*Table structure for table `fechacalendario` */

CREATE TABLE `fechacalendario` (
  `idFechaCalendario` varchar(255) NOT NULL,
  `fecha` varchar(255) NOT NULL,
  `calendario` varchar(255) NOT NULL,
  PRIMARY KEY (`idFechaCalendario`),
  KEY `FK_fecha` (`fecha`),
  KEY `FK_fechacalendario` (`calendario`),
  CONSTRAINT `FK_fecha` FOREIGN KEY (`fecha`) REFERENCES `fecha` (`idFecha`),
  CONSTRAINT `FK_fechacalendario` FOREIGN KEY (`calendario`) REFERENCES `calendario` (`idCalendario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `fechacalendario` */

LOCK TABLES `fechacalendario` WRITE;

UNLOCK TABLES;

/*Table structure for table `grupo` */

CREATE TABLE `grupo` (
  `idGrupo` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idGrupo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `grupo` */

LOCK TABLES `grupo` WRITE;

UNLOCK TABLES;

/*Table structure for table `grupocontacto` */

CREATE TABLE `grupocontacto` (
  `idGrupoContacto` varchar(255) NOT NULL,
  `contacto` varchar(255) NOT NULL,
  `grupo` varchar(255) NOT NULL,
  PRIMARY KEY (`idGrupoContacto`),
  KEY `FK_grupocontacto` (`contacto`),
  KEY `FK_grupocontactog` (`grupo`),
  CONSTRAINT `FK_grupocontacto` FOREIGN KEY (`contacto`) REFERENCES `contacto` (`idContacto`),
  CONSTRAINT `FK_grupocontactog` FOREIGN KEY (`grupo`) REFERENCES `grupo` (`idGrupo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `grupocontacto` */

LOCK TABLES `grupocontacto` WRITE;

UNLOCK TABLES;

/*Table structure for table `guia` */

CREATE TABLE `guia` (
  `idGuia` varchar(255) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  PRIMARY KEY (`idGuia`),
  CONSTRAINT `FK_guia` FOREIGN KEY (`idGuia`) REFERENCES `documento` (`idDocumento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `guia` */

LOCK TABLES `guia` WRITE;

UNLOCK TABLES;

/*Table structure for table `item` */

CREATE TABLE `item` (
  `idItem` varchar(255) NOT NULL,
  `texto` text NOT NULL,
  `documento` varchar(255) NOT NULL,
  `contenido` varchar(255) NOT NULL,
  `hlnt` varchar(255) NOT NULL,
  PRIMARY KEY (`idItem`),
  KEY `FK_itemcon` (`contenido`),
  KEY `FK_itemdoc` (`documento`),
  CONSTRAINT `FK_itemcon` FOREIGN KEY (`contenido`) REFERENCES `contenido` (`idContenido`),
  CONSTRAINT `FK_itemdoc` FOREIGN KEY (`documento`) REFERENCES `documento` (`idDocumento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `item` */

LOCK TABLES `item` WRITE;

UNLOCK TABLES;

/*Table structure for table `listachequeo` */

CREATE TABLE `listachequeo` (
  `idListaChequeo` varchar(255) NOT NULL,
  `observacion` varchar(255) NOT NULL,
  PRIMARY KEY (`idListaChequeo`),
  CONSTRAINT `FK_listachequeo` FOREIGN KEY (`idListaChequeo`) REFERENCES `documento` (`idDocumento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `listachequeo` */

LOCK TABLES `listachequeo` WRITE;

UNLOCK TABLES;

/*Table structure for table `memorando` */

CREATE TABLE `memorando` (
  `idMemorando` varchar(255) NOT NULL,
  `numeroRadicado` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idMemorando`),
  CONSTRAINT `FK_memorando` FOREIGN KEY (`idMemorando`) REFERENCES `comunicacion` (`idComunicacion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `memorando` */

LOCK TABLES `memorando` WRITE;

UNLOCK TABLES;

/*Table structure for table `mensaje` */

CREATE TABLE `mensaje` (
  `idMensaje` varchar(255) NOT NULL,
  `respuestaA` varchar(50) DEFAULT NULL,
  `conversacion` varchar(255) NOT NULL,
  PRIMARY KEY (`idMensaje`),
  KEY `FK_mensajeC` (`conversacion`),
  CONSTRAINT `FK_mensaje` FOREIGN KEY (`idMensaje`) REFERENCES `comunicacion` (`idComunicacion`),
  CONSTRAINT `FK_mensajeC` FOREIGN KEY (`conversacion`) REFERENCES `conversacion` (`idConversacion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `mensaje` */

LOCK TABLES `mensaje` WRITE;

UNLOCK TABLES;

/*Table structure for table `observacion` */

CREATE TABLE `observacion` (
  `idObservacion` varchar(255) NOT NULL,
  `observacion` text,
  `documento` varchar(255) NOT NULL,
  PRIMARY KEY (`idObservacion`),
  KEY `FK_observacion` (`documento`),
  CONSTRAINT `FK_observacion` FOREIGN KEY (`documento`) REFERENCES `documento` (`idDocumento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `observacion` */

LOCK TABLES `observacion` WRITE;

UNLOCK TABLES;

/*Table structure for table `orientacion` */

CREATE TABLE `orientacion` (
  `idOrientacion` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idOrientacion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `orientacion` */

LOCK TABLES `orientacion` WRITE;

UNLOCK TABLES;

/*Table structure for table `palabraclave` */

CREATE TABLE `palabraclave` (
  `idPalabraClave` varchar(255) NOT NULL,
  `palabra` varchar(255) NOT NULL,
  PRIMARY KEY (`idPalabraClave`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `palabraclave` */

LOCK TABLES `palabraclave` WRITE;

UNLOCK TABLES;

/*Table structure for table `palabradocumento` */

CREATE TABLE `palabradocumento` (
  `idPalabraClaveDocumento` varchar(255) NOT NULL,
  `palabraClave` varchar(255) NOT NULL,
  `documento` varchar(255) NOT NULL,
  PRIMARY KEY (`idPalabraClaveDocumento`),
  KEY `FK_palabraclv` (`palabraClave`),
  KEY `FK_palabradocumento` (`documento`),
  CONSTRAINT `FK_palabraclv` FOREIGN KEY (`palabraClave`) REFERENCES `palabraclave` (`idPalabraClave`),
  CONSTRAINT `FK_palabradocumento` FOREIGN KEY (`documento`) REFERENCES `documento` (`idDocumento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `palabradocumento` */

LOCK TABLES `palabradocumento` WRITE;

UNLOCK TABLES;

/*Table structure for table `paquete` */

CREATE TABLE `paquete` (
  `idPaquete` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idPaquete`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `paquete` */

LOCK TABLES `paquete` WRITE;

UNLOCK TABLES;

/*Table structure for table `plantilla` */

CREATE TABLE `plantilla` (
  `idPlantilla` varchar(255) NOT NULL,
  `formato` varchar(255) NOT NULL,
  PRIMARY KEY (`idPlantilla`),
  CONSTRAINT `FK_plantilla` FOREIGN KEY (`idPlantilla`) REFERENCES `documento` (`idDocumento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `plantilla` */

LOCK TABLES `plantilla` WRITE;

UNLOCK TABLES;

/*Table structure for table `producto` */

CREATE TABLE `producto` (
  `idProducto` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `ubicacionEnSistema` varchar(255) DEFAULT NULL,
  `documento` varchar(255) NOT NULL,
  PRIMARY KEY (`idProducto`),
  KEY `FK_producto` (`documento`),
  CONSTRAINT `FK_producto` FOREIGN KEY (`documento`) REFERENCES `documento` (`idDocumento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `producto` */

LOCK TABLES `producto` WRITE;

UNLOCK TABLES;

/*Table structure for table `quien` */

CREATE TABLE `quien` (
  `idQuien` varchar(255) NOT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idQuien`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `quien` */

LOCK TABLES `quien` WRITE;

UNLOCK TABLES;

/*Table structure for table `rol` */

CREATE TABLE `rol` (
  `idRol` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `unidadOrganizacional` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idRol`),
  KEY `FK_rolunidad` (`unidadOrganizacional`),
  CONSTRAINT `FK_rol` FOREIGN KEY (`idRol`) REFERENCES `quien` (`idQuien`),
  CONSTRAINT `FK_rolunidad` FOREIGN KEY (`unidadOrganizacional`) REFERENCES `unidadorganizacional` (`idUnidadOrganizacional`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `rol` */

LOCK TABLES `rol` WRITE;

UNLOCK TABLES;

/*Table structure for table `seriedocumental` */

CREATE TABLE `seriedocumental` (
  `codigo` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `retencionAnios` varchar(20) NOT NULL,
  `disposicionFinal` varchar(20) NOT NULL,
  `procedimiento` varchar(255) NOT NULL,
  `tabladeretencion` varchar(255) NOT NULL,
  `subserie` varchar(255) NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `FK_seriedocumentaltabla` (`tabladeretencion`),
  KEY `FK_subseriedoc` (`subserie`),
  CONSTRAINT `FK_seriedocumentaltabla` FOREIGN KEY (`tabladeretencion`) REFERENCES `tablaretenciondocumental` (`idTabla`),
  CONSTRAINT `FK_subseriedoc` FOREIGN KEY (`subserie`) REFERENCES `seriedocumental` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `seriedocumental` */

LOCK TABLES `seriedocumental` WRITE;

UNLOCK TABLES;

/*Table structure for table `tablaretenciondocumental` */

CREATE TABLE `tablaretenciondocumental` (
  `idTabla` varchar(255) NOT NULL,
  PRIMARY KEY (`idTabla`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tablaretenciondocumental` */

LOCK TABLES `tablaretenciondocumental` WRITE;

UNLOCK TABLES;

/*Table structure for table `tipodocumento` */

CREATE TABLE `tipodocumento` (
  `idTipoDoc` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `guia` varchar(255) DEFAULT NULL,
  `plantilla` varchar(255) DEFAULT NULL,
  `listachequeo` varchar(255) DEFAULT NULL,
  `orientacion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idTipoDoc`),
  KEY `FK_tipodocPlantilla` (`plantilla`),
  KEY `FK_tipodocumentolista` (`listachequeo`),
  KEY `FK_tipodocumentoguia` (`guia`),
  KEY `FK_tipodocorientacion` (`orientacion`),
  CONSTRAINT `FK_tipodocorientacion` FOREIGN KEY (`orientacion`) REFERENCES `orientacion` (`idOrientacion`),
  CONSTRAINT `FK_tipodocPlantilla` FOREIGN KEY (`plantilla`) REFERENCES `plantilla` (`idPlantilla`),
  CONSTRAINT `FK_tipodocumentoguia` FOREIGN KEY (`guia`) REFERENCES `guia` (`idGuia`),
  CONSTRAINT `FK_tipodocumentolista` FOREIGN KEY (`listachequeo`) REFERENCES `listachequeo` (`idListaChequeo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tipodocumento` */

LOCK TABLES `tipodocumento` WRITE;

UNLOCK TABLES;

/*Table structure for table `unidadorganizacional` */

CREATE TABLE `unidadorganizacional` (
  `idUnidadOrganizacional` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `edificio` varchar(255) NOT NULL,
  `unidadorganizacional` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idUnidadOrganizacional`),
  KEY `FK_edificio` (`edificio`),
  KEY `FK_unidadorg` (`unidadorganizacional`),
  CONSTRAINT `FK_edificio` FOREIGN KEY (`edificio`) REFERENCES `edificio` (`idEdificio`),
  CONSTRAINT `FK_unidadorg` FOREIGN KEY (`unidadorganizacional`) REFERENCES `unidadorganizacional` (`idUnidadOrganizacional`),
  CONSTRAINT `FK_unidadorganizacional` FOREIGN KEY (`idUnidadOrganizacional`) REFERENCES `quien` (`idQuien`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `unidadorganizacional` */

LOCK TABLES `unidadorganizacional` WRITE;

UNLOCK TABLES;

/*Table structure for table `version` */

CREATE TABLE `version` (
  `idVersion` varchar(255) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `cuenta` varchar(255) NOT NULL,
  `formato` varchar(255) NOT NULL,
  `documento` varchar(255) NOT NULL,
  `version` varchar(255) NOT NULL,
  PRIMARY KEY (`idVersion`),
  KEY `FK_versionv` (`version`),
  KEY `FK_versiondoc` (`documento`),
  CONSTRAINT `FK_versiondoc` FOREIGN KEY (`documento`) REFERENCES `documento` (`idDocumento`),
  CONSTRAINT `FK_versionv` FOREIGN KEY (`version`) REFERENCES `version` (`idVersion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `version` */

LOCK TABLES `version` WRITE;

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
