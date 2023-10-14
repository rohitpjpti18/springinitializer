package io.github.rohitpjpti18.springinitializer.module

import com.intellij.ide.util.projectWizard.ModuleBuilder
import com.intellij.ide.util.projectWizard.ModuleWizardStep
import com.intellij.ide.util.projectWizard.WizardContext
import com.intellij.openapi.Disposable
import com.intellij.openapi.roots.ModifiableRootModel


class SpringInitializerBuilder: ModuleBuilder() {
    override fun setupRootModel(modifiableRootModel: ModifiableRootModel) {}

    override fun getModuleType(): InitializerModuleType {
        return InitializerModuleType.getInstance();
    }

    override fun getCustomOptionsStep(context: WizardContext?, parentDisposable: Disposable?): ModuleWizardStep {
        return StepUpWizard();
    }

}