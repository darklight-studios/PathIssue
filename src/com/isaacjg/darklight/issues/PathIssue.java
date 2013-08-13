package com.isaacjg.darklight.issues;

import com.ijg.darklight.sdk.core.Issue;

/*
 * PathIssue - An Issue for Darklight Nova Core
 * Copyright © 2013 Isaac Grant
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * PathIssue is an Issue for Darklight Nova Core that checks if
 * given "bad paths" are present in the system path variable
 * 
 * @author Isaac Grant
 */

public class PathIssue extends Issue {

	private String[] badPaths;
	
	public PathIssue() {
		super("Path", "The path has been cleansed of its impurities");
	}

	public void setBadPaths(String[] badPaths) {
		this.badPaths = badPaths;
	}
	
	@Override
	public boolean isFixed() {
		String path = System.getProperty("java.library.path");
		for (String badPath : badPaths) {
			if (path.contains(badPath)) {
				return false;
			}
		}
		return true;
	}

}
