/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.webview.bugreport;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author shannah
 */
public class JavaWebviewBugReport extends Application {

    @Override
    public void start(Stage primaryStage) {

        WebView webView = new WebView();
        setPage(webView);
        StackPane root = new StackPane();
        root.getChildren().add(webView);

        Scene scene = new Scene(root, 640, 480);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    void setPage(WebView webView) {
        String html = "<!DOCTYPE html>\n"
                + "  <html>\n"
                + "  <head>\n"
                + "  <meta >\n"
                + "    <title> \"Vista de Clientes\" </title>\n"
                + "\n"
                + "    <style> \n"
                + "    #map {\n"
                + "        height: 100%;\n"
                + "    }\n"
                + "    html, body {\n"
                + "  font-family: sans-serif;\n"
                + "        height: 100%;\n"
                + "        margin: 0;\n"
                + "        padding: 0;\n"
                + "    }\n"
                + "\n"
                + "  .controls {\n"
                + "  margin-top: 10px;\n"
                + "  border: 1px solid transparent;\n"
                + "  border-radius: 2px 0 0 2px;\n"
                + "  box-sizing: border-box;\n"
                + "  -moz-box-sizing: border-box;\n"
                + "  height: 32px;\n"
                + "  outline: none;\n"
                + "  box-shadow: 0 2px 6px rgba(0, 0, 0, 0.3);\n"
                + "  }\n"
                + "\n"
                + "  #pac-input {\n"
                + "  background-color: #fff;\n"
                + "  font-family: Roboto;\n"
                + "  font-size: 15px;\n"
                + "  font-weight: 300;\n"
                + "  margin-left: 12px;\n"
                + "  padding: 0 11px 0 13px;\n"
                + "  text-overflow: ellipsis;\n"
                + "  width: 300px;\n"
                + "  }\n"
                + "\n"
                + "  #pac-input:focus {\n"
                + "  border-color: #4d90fe;\n"
                + "  }\n"
                + "\n"
                + "  .pac-container {\n"
                + "  font-family: Roboto;\n"
                + "  }\n"
                + "\n"
                + "  #type-selector {\n"
                + "  color: #fff;\n"
                + "  background-color: #4d90fe;\n"
                + "  padding: 5px 11px 0px 11px;\n"
                + "  }\n"
                + "\n"
                + "  #type-selector label {\n"
                + "  font-family: Roboto;\n"
                + "  font-size: 13px;\n"
                + "  font-weight: 300;\n"
                + "  }\n"
                + "  #target {\n"
                + "  width: 345px;\n"
                + "  }\n"
                + "    </style>\n"
                + "  </head>\n"
                + "  <body>\n"
                + "\n"
                + "  <input id=\"pac-input\" class=\"controls\" type=\"text\" placeholder=\"Search Box\">\n"
                + "  <h1> hola </h1>\n"
                + "    <div id=\"map\"></div>\n"
                + "\n"
                + "    <script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?key=APIKEYISGOOD&libraries=places\"></script>\n"
                + "\n"
                + "  <script>\n"
                + "\n"
                + "\n"
                + "\n"
                + "  // object for the stores\n"
                + "  var GreenCircle = {\n"
                + "  path: google.maps.SymbolPath.CIRCLE,\n"
                + "  fillColor: 'Lime',\n"
                + "  fillOpacity: 1,\n"
                + "  scale: 10,\n"
                + "  strokeColor: 'green',\n"
                + "  strokeWeight: 1\n"
                + "  }; \n"
                + "\n"
                + "  // google map instance\n"
                + "  var map;\n"
                + "  var markers = [];\n"
                + "\n"
                + "  // function for the initialization\n"
                + "  function initMap() {\n"
                + "  map = new google.maps.Map(document.getElementById('map'), {\n"
                + "  zoom: 12,\n"
                + "  center: {lat: 21.8857199, lng: -102.3613399}\n"
                + "  });\n"
                + "\n"
                + "  var input = document.getElementById('pac-input');\n"
                + "  var searchBox = new google.maps.places.SearchBox(input);\n"
                + "  map.controls[google.maps.ControlPosition.TOP_LEFT].push(input);\n"
                + "\n"
                + "  // Bias the SearchBox results towards current map's viewport.\n"
                + "  map.addListener('bounds_changed', function() {\n"
                + "  searchBox.setBounds(map.getBounds());\n"
                + "  });\n"
                + "\n"
                + "\n"
                + "  searchBox.addListener('places_changed', function() {\n"
                + "  var places = searchBox.getPlaces();\n"
                + "\n"
                + "  if (places.length == 0) {\n"
                + "  return;\n"
                + "  }\n"
                + "\n"
                + "\n"
                + "  // Clear out the old markers.\n"
                + "  markers.forEach(function(marker) {\n"
                + "  marker.setMap(null);\n"
                + "  });\n"
                + "  markers = [];\n"
                + "\n"
                + "  // For each place, get the icon, name and location.\n"
                + "  var bounds = new google.maps.LatLngBounds();\n"
                + "  places.forEach(function(place) {\n"
                + "  if (!place.geometry) {\n"
                + "  console.log(\"Returned place contains no geometry\");\n"
                + "  return;\n"
                + "  }\n"
                + "\n"
                + "  var icon = {\n"
                + "  url: place.icon,\n"
                + "  size: new google.maps.Size(71, 71),\n"
                + "  origin: new google.maps.Point(0, 0),\n"
                + "  anchor: new google.maps.Point(17, 34),\n"
                + "  scaledSize: new google.maps.Size(25, 25)\n"
                + "  };\n"
                + "\n"
                + "  // Create a marker for each place.\n"
                + "  markers.push(new google.maps.Marker({\n"
                + "  map: map,\n"
                + "  icon: icon,\n"
                + "  title: place.name,\n"
                + "  position: place.geometry.location,\n"
                + "  draggable: true\n"
                + "  }));\n"
                + "\n"
                + "  if (place.geometry.viewport) {\n"
                + "  // Only geocodes have viewport.\n"
                + "  bounds.union(place.geometry.viewport);\n"
                + "  } else {\n"
                + "  bounds.extend(place.geometry.location);\n"
                + "  }\n"
                + "  });\n"
                + "  map.fitBounds(bounds);\n"
                + "  }); \n"
                + "  }\n"
                + "\n"
                + "    initMap();\n"
                + "\n"
                + "    function setMarker(latvar, lngvar, labels){\n"
                + "  var marker = new google.maps.Marker({ \n"
                + "  position: { lat: latvar, lng: lngvar},\n"
                + "  map: map,\n"
                + "  label: labels || \"\",\n"
                + "  tittle: labels,\n"
                + "  icon: GreenCircle\n"
                + "  });\n"
                + "    }\n"
                + "\n"
                + "  function setSelfMarker(Geojson)\n"
                + "  {\n"
                + "  map.data.addGeoJson( JSON.parse(Geojson) );\n"
                + "  }\n"
                + "\n"
                + "  function setPosition(lat, lng)\n"
                + "  {\n"
                + "  map.setCenter(new google.maps.LatLng( lat, lng ) );\n"
                + "  }\n"
                + "\n"
                + "    </script>\n"
                + "\n"
                + "\n"
                + "  </body>\n"
                + "  </html>";
        webView.getEngine().loadContent(html);

    }
}
