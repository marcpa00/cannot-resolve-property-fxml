package org.example

import griffon.core.artifact.GriffonView
import griffon.metadata.ArtifactProviderFor
import org.codehaus.griffon.runtime.javafx.artifact.AbstractJavaFXGriffonView

@ArtifactProviderFor(GriffonView)
class CannotResolvePropertyFxmlView extends AbstractJavaFXGriffonView {
    FactoryBuilderSupport builder
    CannotResolvePropertyFxmlModel model
    CannotResolvePropertyFxmlController controller

    void initUI() {

        builder.with {
            content = fxml(resource(
                    //'/cannotResolve.fxml'
                    '/canResolve.fxml'
            )) {
                bean(input, text: bind(model.input()))
                bean(output, text: bind(model.output()))
            }
            connectActions(content, controller)

            application(title: application.configuration['application.title'],
                    sizeToScene: true, centerOnScreen: true, name: 'mainWindow') {
                scene(fill: WHITE, width: 700, height: 90) {
                    anchorPane {
                        fxml content
                    }
                }
            }
        }
    }
}