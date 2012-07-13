(ns Reffonomics-Main.views.pages
  (:require [Reffonomics-Main.views.common :as template])
  (:use [noir.core]
        [hiccup.core]))

(defpage "/" []
  (render "/splash"))

(defpage "/splash" []
  (template/splash
    [:h1 "Splash"]))

(defpage "/general" []
  (template/general
    [:h1 "General Economics"]))

(defpage "/micro" []
  (template/micro
    [:h1 "Micro Economics"]))

(defpage "/macro" []
  (template/macro
    [:h1 "Macro Economics"]))
