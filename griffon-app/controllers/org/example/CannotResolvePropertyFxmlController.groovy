package org.example

import griffon.core.artifact.GriffonController
import griffon.metadata.ArtifactProviderFor
import griffon.transform.Threading

@ArtifactProviderFor(GriffonController)
class CannotResolvePropertyFxmlController {
    CannotResolvePropertyFxmlModel model

    @Threading(Threading.Policy.INSIDE_UITHREAD_ASYNC)
    void sayHello() {
        model.output = "Hello ${model.input ?: 'there' } !"
    }
}