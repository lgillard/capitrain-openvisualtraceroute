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

	/**
	 * Rank of the packet in the traceroute path
	 */
	private int indice;

	/**
	 * IP of the packet
	 */
	private String ip;

	/**
	 * Id of the traceroute the packet is linked to
	 */
	private int traceroute;

	/**
	 * Name of the IP location, it should something like "Orange", "Free", "SFR"... But it is not always.
	 */
	private String isp;

	/**
	 * Localization of the IP
	 */
	private Position position;

	public PacketPassage() {
		super();
	}

	public PacketPassage(final int indice, final String ip, final int traceroute, final String isp) {
		super();
		this.indice = indice;
		this.ip = ip;
		this.traceroute = traceroute;
		this.isp = isp;
	}

	public PacketPassage(final int indice, final String ip, final int traceroute, final String isp, final Position position) {
		super();
		this.indice = indice;
		this.ip = ip;
		this.traceroute = traceroute;
		this.isp = isp;
		this.position = position;
	}

	public int getTraceroute() {
		return traceroute;
	}

	public void setTraceroute(final int traceroute) {
		this.traceroute = traceroute;
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

	public String getIsp() {
		return isp;
	}

	public void setIsp(final String isp) {
		this.isp = isp;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(final Position position) {
		this.position = position;
	}
}
