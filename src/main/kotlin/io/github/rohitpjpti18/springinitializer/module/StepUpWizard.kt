package io.github.rohitpjpti18.springinitializer.module

import com.intellij.ide.util.projectWizard.ModuleWizardStep
import javax.swing.JComponent
import javax.swing.JLabel

class StepUpWizard: ModuleWizardStep() {
    override fun getComponent(): JComponent {
        return JLabel("Provide some setting here");
    }

    override fun updateDataModel() {
        TODO("Not yet implemented")
    }
}