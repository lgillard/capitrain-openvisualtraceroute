/**
 * Open Visual Trace Route
 * Copyright (C) 2010-2015 Leo Lewis.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.leo.traceroute.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * IpAdress Represent an IP adress which will be used for traceroute
 * <pre>
 * </pre>
 * @author Oceane
 */
@JsonIgnoreProperties(value = { "packetPassages", "position" })
public class IpAdress {
	/**
	 * Id in database
	 */
	private int id;

	/**
	 * True if the ip is meant to be shared, false if it was created during a traceroute call
	 */
	private boolean shared;

	/**
	 * Ip adress
	 */
	private String ip;

	public IpAdress() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public boolean isShared() {
		return shared;
	}

	public void setIsShared(final boolean isShared) {
		this.shared = isShared;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(final String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return ip + " (shared ? " + shared + ")";
	}
}
