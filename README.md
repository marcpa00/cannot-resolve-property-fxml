This Griffon JavaFX/Groovy project is to show a problem with property access in a certain case.
-----------------------------------

This project uses 2 FXML files to set the gui content (under griffon-app/resources) : 
* canResolve.fxml : with this, `input`, `output` and `sayHelloTarget` are all correctly resolved in the view class and properly binded.
* cannotResolve.fxml : with this, we get an `MissingPropertyException` at initialization:

```
[2015-08-28 17:23:10,807] [JavaFX Application Thread] ERROR griffon.core.GriffonExceptionHandler - Uncaught Exception
groovy.lang.MissingPropertyException: No such property: input for class: griffon.util.CompositeBuilder
	at griffon.util.CompositeBuilder$2.doCall(CompositeBuilder.java:116)
	at org.example.CannotResolvePropertyFxmlView$_initUI_closure1$_closure2.doCall(CannotResolvePropertyFxmlView.groovy:20)
	at org.example.CannotResolvePropertyFxmlView$_initUI_closure1$_closure2.doCall(CannotResolvePropertyFxmlView.groovy)
	at groovyx.javafx.factory.FXMLFactory.onNodeChildren(FXMLFactory.groovy:129)
	at org.example.CannotResolvePropertyFxmlView$_initUI_closure1.doCall(CannotResolvePropertyFxmlView.groovy:16)
	at org.example.CannotResolvePropertyFxmlView.initUI(CannotResolvePropertyFxmlView.groovy:15)
	
```

The only difference between the two cases is in the FXML structure : one has a SplitPane at top (cannotResolve.fxml) one has an AnchorPane (canResolve.fxml).
When org.example.CannotResolvePropertyFxmlView uses `canResolve.fxml`, everything is ok, when instead it uses `cannotResolve.fxml`, we get the execption.
 
