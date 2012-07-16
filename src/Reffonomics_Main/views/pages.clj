(ns Reffonomics-Main.views.pages
  (:require [Reffonomics-Main.views.common :as template])
  (:use [noir.core]
        [hiccup.core]
        [hiccup.element]))

(defpage "/" []
  (render "/splash"))

(defpage "/splash" []
  (template/splash
    [:h1 "Welcome To Reffonomics"]
  ))

(defpage "/basic" []
  (template/basic
    [:div.row-fluid
      [:div.span3
        (template/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Basic Concepts"]]]]
  ))

(defpage "/micro" []
  (template/micro
    [:div.row-fluid
      [:div.span3
        (template/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Micro Economics"]]]]
  ))

(defpage "/macro" []
  (template/macro
    [:div.row-fluid
      [:div.span3
        (template/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Macro Economics"]]]]
  ))

(defpage "/resources" []
  (template/resources
    [:div.row-fluid
      [:div.span3
        (template/side-navbar)]
      [:div.span9
        [:div.hero-unit
          [:h1 "Resources"]]]]
  ))
