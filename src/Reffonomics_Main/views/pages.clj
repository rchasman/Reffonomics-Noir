(ns Reffonomics-Main.views.pages
  (:require [Reffonomics-Main.views.common :as template])
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]))

(defpage "/" []
  (render "/splash"))

(defpage "/splash" []
  (template/splash
    [:br]
    [:h1 "Welcome To Reffonomics"]
    [:br][:br]
    [:div#featured
      (image {:width "500px"} "images/splash1.jpg")
      (image {:width "500px"} "images/splash2.jpg")
      (image {:width "500px"} "images/splash3.jpg")]))

(defpage "/basic" []
  (template/basic
    [:h1 "Basic Concepts"]))

(defpage "/micro" []
  (template/micro
    [:h1 "Micro Economics"]))

(defpage "/macro" []
  (template/macro
    [:h1 "Macro Economics"]))
