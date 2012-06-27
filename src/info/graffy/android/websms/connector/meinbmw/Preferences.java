/*
 * Copyright (C) 2010 Silas Graffy
 * 
 * This file is part of MeinBMW Connector for WebSMS by Felix Bechstein.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; If not, see <http://www.gnu.org/licenses/>.
 */
package info.graffy.android.websms.connector.meinbmw;

import android.os.Bundle;
import de.ub0r.android.websms.connector.common.ConnectorPreferenceActivity;

public final class Preferences extends ConnectorPreferenceActivity {
	/** Preference key: enabled. */
	static final String PREFS_ENABLED = "enable_meinbmw";
	static final String PREFS_USER = "user_meinbmw";
	static final String PREFS_PASSWORD = "password_meinbmw";

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.addPreferencesFromResource(R.xml.connector_meinbmw_prefs);
	}
}
