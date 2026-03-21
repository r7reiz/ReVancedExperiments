package li.auna.patches.telegram.disableautoupdate

import app.revanced.patcher.patch.bytecodePatch
import li.auna.util.returnEarly

@Suppress("unused")
val unlockProPatch = bytecodePatch(
    name = "Disable Auto Update",
    description = "Disable Auto Update",
) {
    compatibleWith(
        "org.telegram.messenger",
        "org.telegram.messenger.web",
        "org.telegram.messenger.beta",
        "org.telegram.plus"
    )

    apply {
        checkAppUpdateMethod.returnEarly()
        setNewAppVersionAvailableMethod.returnEarly(false)
        blockViewUpdateMethod.returnEarly()
    }
}
