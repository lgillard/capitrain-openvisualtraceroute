This project is a fork from here : https://github.com/c4pt000/openvisualtraceroute-installer

# Overview

This application is meant to be used with this API : https://github.com/Zigotote/capitrain-api.
! You need to download and launch the API before running openvisualtraceroute.

# Launch

All you need is downloading the source code and running it from your favorite IDE.
! Be carefull to launch the API and check the api.url property is correct in src/org/leo/traceroute/resources/static.properties before starting the Java application

# Description

At the beggining, the application gets the shared IP saved in the capitrain-api (cf org.leo.traceroute.Main.java).
Then, after the IHM is rendered, it launches a traceroute to every shared IP :

- The "host IP" input is automatically field thanks to the org.leo.traceroute.ui.control.ControlPanel.TraceRouteControl.fillTraceRoute() method. It also clicks on the button which starts the traceroute.
- Once the traceroute is started, it calls the org.leo.traceroute.core.route.impl.AbstractTraceRoute.compute(String, CancelMonitor, boolean, long, boolean, boolean, int, TraceRouteControl) method. This method is used to draw the points on the map during the traceroute's execution. Thanks to HttpPost requests, all the states of the traceroute are saved.

# Elements saved

During a traceroute, some elements are saved :

- A org.leo.traceroute.models.Traceroute object is posted to the API, with a starting hour
- For each location the packet meets, a org.leo.traceroute.models.PacketPassage object is created. It stores the IP where the packet is, its rank during the route, its position (if known) and ideally it should contain an ISP, but right now we do not know how to get it so we save an hostname, which can look like "livebox.home" or "xxxxxx.renater.xxxx". This PacketPassage is linked to a Traceroute and then posted to the API to save it.

# Subleties

- If a traceroute encounters 3 unknown points in a row, it is stoped. We consider that the end of the route is reached.
- If the packet is in an unknown position (unknown IP and localization), it is not saved in order not to overload the database whith useless data
