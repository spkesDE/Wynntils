/*
 *  * Copyright © Wynntils - 2018.
 */

package cf.wynntils.modules.core.config;

import cf.wynntils.core.framework.settings.annotations.SettingsInfo;
import cf.wynntils.core.framework.settings.instances.SettingsHolder;

@SettingsInfo(name = "main")
public class CoreDBConfig extends SettingsHolder {

    public static CoreDBConfig INSTANCE;

    public String lastToken = "";

    @Override
    public void onSettingChanged(String name) {

    }

}
