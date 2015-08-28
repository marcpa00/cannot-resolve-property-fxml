application {
    title = 'cannot-resolve-property-fxml'
    startupGroups = ['cannotResolvePropertyFxml']
    autoShutdown = true
}
mvcGroups {
    // MVC Group for "cannotResolvePropertyFxml"
    'cannotResolvePropertyFxml' {
        model      = 'org.example.CannotResolvePropertyFxmlModel'
        view       = 'org.example.CannotResolvePropertyFxmlView'
        controller = 'org.example.CannotResolvePropertyFxmlController'
    }
}