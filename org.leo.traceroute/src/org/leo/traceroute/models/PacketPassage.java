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

/**
 * PacketPassage Represent a point where a packet passes during traceroute (in database)
 * <pre>
 * </pre>
 * @author Oceane
 */
public class PacketPassage {
	private int id;
	private int indice;
	private String ip;

	private Traceroute traceroute;

	public PacketPassage() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(final int indice) {
		this.indice = indice;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(final String ip) {
		this.ip = ip;
	}

	public Traceroute getTraceroute() {
		return traceroute;
	}

	public void setTraceroute(final Traceroute traceroute) {
		this.traceroute = traceroute;
	}
}
