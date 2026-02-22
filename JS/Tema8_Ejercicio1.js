/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 1
 * =====================================================
 * Trabajar con objetos y la estructura Map.
 * 
 * EXPLICACIÓN:
 * - Objetos: pares clave-valor simples
 * - Map: estructura más poderosa para clave-valor
 * - Métodos: set, get, has, delete
 */

// Objeto simple
const persona = {
    nombre: "Juan",
    edad: 30,
    ciudad: "Madrid"
};

// Map
const contactos = new Map();
contactos.set("ana", {telefono: "123456", email: "ana@email.com"});
contactos.set("bob", {telefono: "789012", email: "bob@email.com"});
contactos.set("carlos", {telefono: "345678", email: "carlos@email.com"});

console.log("=== OBJETOS Y MAPS ===");

console.log("Objeto simple:");
console.log(`Nombre: ${persona.nombre}`);
console.log(`Edad: ${persona.edad}`);

console.log("\nMap de contactos:");
contactos.forEach((info, nombre) => {
    console.log(`${nombre}: ${info.telefono} - ${info.email}`);
});

console.log(`\n¿Existe 'ana'? ${contactos.has("ana")}`);
console.log(`¿Existe 'david'? ${contactos.has("david")}`);

contactos.delete("bob");
console.log(`Después de eliminar 'bob': ${contactos.size} contactos`);

/*
 * SALIDA ESPERADA:
 * === OBJETOS Y MAPS ===
 * Objeto simple:
 * Nombre: Juan
 * Edad: 30
 * 
 * Map de contactos:
 * ana: 123456 - ana@email.com
 * bob: 789012 - bob@email.com
 * carlos: 345678 - carlos@email.com
 * 
 * ¿Existe 'ana'? true
 * ¿Existe 'david'? false
 * Después de eliminar 'bob': 2 contactos
 */
