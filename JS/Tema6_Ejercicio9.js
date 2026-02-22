/*
 * TEMA 6: CADENAS DE CARACTERES - EJERCICIO 9
 * ============================================
 * Validar contraseñas según criterios.
 * 
 * EXPLICACIÓN:
 * - Validación con regex o condicionales
 * - Criterios: longitud, mayúsculas, números, símbolos
 * - Mensajes de retroalimentación
 */

function validarContrasena(password) {
    const criterios = {
        longitud: password.length >= 8,
        mayuscula: /[A-Z]/.test(password),
        minuscula: /[a-z]/.test(password),
        numero: /[0-9]/.test(password),
        simbolo: /[!@#$%^&*]/.test(password)
    };
    
    const cumplidos = Object.values(criterios).filter(Boolean).length;
    const fortaleza = 
        cumplidos === 5 ? 'MUY FUERTE' :
        cumplidos === 4 ? 'FUERTE' :
        cumplidos === 3 ? 'MEDIA' :
        cumplidos <= 2 ? 'DÉBIL' : 'INACEPTABLE';
    
    return {criterios, fortaleza};
}

const contrasenas = ['abc', 'password123', 'Pass123!', 'Abc@123xyz'];

console.log("=== VALIDACIÓN DE CONTRASEÑAS ===\n");

contrasenas.forEach(pwd => {
    const {criterios, fortaleza} = validarContrasena(pwd);
    
    console.log(`Contraseña: "${pwd}"`);
    console.log(`✓ Longitud ≥ 8: ${criterios.longitud ? 'SÍ' : 'NO'}`);
    console.log(`✓ Mayúscula (A-Z): ${criterios.mayuscula ? 'SÍ' : 'NO'}`);
    console.log(`✓ Minúscula (a-z): ${criterios.minuscula ? 'SÍ' : 'NO'}`);
    console.log(`✓ Número (0-9): ${criterios.numero ? 'SÍ' : 'NO'}`);
    console.log(`✓ Símbolo (!@#...): ${criterios.simbolo ? 'SÍ' : 'NO'}`);
    console.log(`Fortaleza: ${fortaleza}\n`);
});

/*
 * SALIDA ESPERADA:
 * === VALIDACIÓN DE CONTRASEÑAS ===
 * 
 * Contraseña: "abc"
 * ✓ Longitud ≥ 8: NO
 * ✓ Mayúscula (A-Z): NO
 * ✓ Minúscula (a-z): SÍ
 * ✓ Número (0-9): NO
 * ✓ Símbolo (!@#...): NO
 * Fortaleza: DÉBIL
 * 
 * Contraseña: "password123"
 * ✓ Longitud ≥ 8: SÍ
 * ✓ Mayúscula (A-Z): NO
 * ✓ Minúscula (a-z): SÍ
 * ✓ Número (0-9): SÍ
 * ✓ Símbolo (!@#...): NO
 * Fortaleza: MEDIA
 * 
 * ...
 */
