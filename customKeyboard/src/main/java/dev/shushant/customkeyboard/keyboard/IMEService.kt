package dev.shushant.customkeyboard.keyboard

import android.view.View
import androidx.lifecycle.ViewModelStoreOwner
import androidx.savedstate.SavedStateRegistryOwner
import androidx.lifecycle.*
import androidx.savedstate.SavedStateRegistry
import androidx.savedstate.SavedStateRegistryController
import androidx.savedstate.setViewTreeSavedStateRegistryOwner

class IMEService : LifecycleInputMethodService(),
    ViewModelStoreOwner,
    SavedStateRegistryOwner {

    override fun onCreateInputView(): View {
        val view = CustomKeyboard(context = this)

        window?.window?.decorView?.let { decorView ->
            decorView.setViewTreeLifecycleOwner(this)
            decorView.setViewTreeViewModelStoreOwner(this)
            decorView.setViewTreeSavedStateRegistryOwner(this)
        }
        return view
    }


    override fun onCreate() {
        super.onCreate()
        savedStateRegistryController.performRestore(null)

    }

    override val viewModelStore: ViewModelStore
        get() = store
    override val lifecycle: Lifecycle
        get() = dispatcher.lifecycle


    //ViewModelStore Methods
    private val store = ViewModelStore()

    //SaveStateRegistry Methods

    private val savedStateRegistryController = SavedStateRegistryController.create(this)

    override val savedStateRegistry: SavedStateRegistry get() = savedStateRegistryController.savedStateRegistry
}