package com.grupoinvestigaciondam.investigacion.controlador;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioControlador {

    @RestController
    @RequestMapping("/api/usuarios")
    public class UsuarioController {

        @Autowired
        private UsuarioService usuarioService;

        @GetMapping
        public List<Usuario> getAllUsuarios() {
            return usuarioService.findAll();
        }

        @GetMapping("/{id}")
        public ResponseEntity<Usuario> getUsuarioById(@PathVariable Long id) {
            return usuarioService.findById(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
        }

        @PostMapping
        public Usuario createUsuario(@RequestBody Usuario usuario) {
            return usuarioService.save(usuario);
        }

        @PutMapping("/{id}")
        public ResponseEntity<Usuario> updateUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
            try {
                Usuario actualizado = usuarioService.update(id, usuario);
                return ResponseEntity.ok(actualizado);
            } catch (RuntimeException e) {
                return ResponseEntity.notFound().build();
            }
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
            usuarioService.deleteById(id);
            return ResponseEntity.noContent().build();
        }

}
