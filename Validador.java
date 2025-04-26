import java.util.regex.Pattern;

public class Validador {
    private static final String REGEX_NOMBRE = "^[A-Za-zÁÉÍÓÚáéíóúñÑ\\s]{2,50}$";
    private static final String REGEX_CORREO = "^[\\w-.]+@[\\w-]+\\.[a-zA-Z]{2,}$";
    private static final String REGEX_CONTRASEÑA = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

    public static boolean validarNombre(String nombre) {
        return Pattern.matches(REGEX_NOMBRE, nombre);
    }

    public static boolean validarCorreo(String correo) {
        return Pattern.matches(REGEX_CORREO, correo);
    }

    public static boolean validarContraseña(String contraseña) {
        return Pattern.matches(REGEX_CONTRASEÑA, contraseña);
    }
}
