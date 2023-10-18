#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package servicios;

import java.sql.Connection;
/**
 * Interfaz para los metodos de la conexion
 * 021023 dpm
 */
public interface ConexionInterfaz {

	/**
	 * crea la conexion
	 * @return conexion
	 */
	Connection crearConexion();
}
