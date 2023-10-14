package io.github.rohitpjpti18.springinitializer.icons

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

class SvgIcon {

    companion object {
        final val DEFAULT_ICON: Icon = IconLoader.getIcon("icons/pluginIcon.svg", javaClass);
        final val SPRING_INITIALIZER_ICON: Icon = IconLoader.getIcon("icons/spring.svg", javaClass);
    }

}