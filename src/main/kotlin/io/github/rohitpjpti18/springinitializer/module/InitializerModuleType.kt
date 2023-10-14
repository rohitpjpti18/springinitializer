package io.github.rohitpjpti18.springinitializer.module

import com.intellij.ide.util.projectWizard.ModuleWizardStep
import com.intellij.ide.util.projectWizard.WizardContext
import com.intellij.openapi.module.ModuleType
import com.intellij.openapi.module.ModuleTypeManager
import com.intellij.openapi.roots.ui.configuration.ModulesProvider
import com.intellij.openapi.util.IconLoader
import io.github.rohitpjpti18.springinitializer.icons.SvgIcon
import javax.swing.Icon


class InitializerModuleType(): ModuleType<SpringInitializerBuilder>(ID) {

    companion object {
        final var ID: String = "INITIALIZER_MODULE_TYPE"
        fun getInstance(): InitializerModuleType {
            return ModuleTypeManager.getInstance().findByID(ID) as InitializerModuleType
        }
    }


    override fun createModuleBuilder(): SpringInitializerBuilder {
        return SpringInitializerBuilder()
    }

    override fun getName(): String {
        return "Spring Initializer"
    }

    override fun getDescription(): String {
        return "New Project using spring initializer"
    }

    override fun getNodeIcon(isOpened: Boolean): Icon {
        return SvgIcon.DEFAULT_ICON;
    }

    fun createWizardSteps(wizardContext: WizardContext?,
                          moduleBuilder: SpringInitializerBuilder?,
                          modulesProvider: ModulesProvider?): Array<ModuleWizardStep>? {
        return super.createWizardSteps(wizardContext!!, moduleBuilder!!, modulesProvider!!)
    }
}