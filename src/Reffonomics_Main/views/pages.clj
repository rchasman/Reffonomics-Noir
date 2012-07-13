(ns Reffonomics-Main.views.welcome
  (:require [Reffonomics-Main.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/" []
         (common/layout
           [:p "Welcome to Reffonomics-Main"]))
