package org.example

import griffon.core.artifact.GriffonModel
import griffon.transform.FXObservable
import griffon.metadata.ArtifactProviderFor
import groovyx.javafx.beans.FXBindable

@ArtifactProviderFor(GriffonModel)
class CannotResolvePropertyFxmlModel {
    @FXBindable String input
    @FXBindable String output
}