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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFilter;

/**
 * Traceroute Represent a traceroute (in database)
 * <pre>
 * </pre>
 * @author Oceane
 */
// Filter sometimes used to ignore id field
@JsonFilter("idFilter")
public class Traceroute {

	/**
	 * Id in database
	 */
	private int id;

	/**
	 * When the traceroute started
	 */
	private Date date;

	/**
	 * List of the IP adresses the packet crossed
	 */
	private final List<PacketPassage> packetPassages;

	public Traceroute() {
		super();
		date = new Date();
		packetPassages = new ArrayList<PacketPassage>();
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getDate() {
		return date.toString();
	}

	public void setDate(final Date date) {
		this.date = date;
	}

	public List<PacketPassage> getPacketPassages() {
		return packetPassages;
	}
}
