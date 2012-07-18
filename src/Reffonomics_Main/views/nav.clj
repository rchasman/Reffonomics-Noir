(ns Reffonomics-Main.views.nav
  (:require [Reffonomics-Main.views.common :as template]
            [Reffonomics-Main.views.text :as text])
  (:use [noir.core]
        [hiccup.core]
        [hiccup.page]
        [hiccup.element]))

(defpartial top-navbar-collapse []
  [:div.nav-collapse
    [:ul#main-nav.nav
      [:li#nav-1 (link-to "/basic" "Basic Concepts")]
      [:li#nav-2 (link-to "/micro" "Micro Economics")]
      [:li#nav-3 (link-to "/macro" "Macro Economics")]
      [:li#nav-4 (link-to "/resources" "Resources")]
      [:li#nav-5 (link-to "/about" "About")]
      [:li#nav-6 (link-to "/tests" "Tests")]]
    [:ul.nav.pull-right
      [:form.navbar-search
        [:input {:type "text" :class "search-query" :placeholder "Search"}]]
      [:li.divider-vertical]
      [:li.divider-vertical]
      [:li "Welcome back:<br>{user}"]
      [:li.divider-vertical]]])

(defpartial top-navbar []
  (javascript-tag "$(document).ready(function(){
                    $('.collapse').collapse();});")
  [:div.navbar
    [:div.navbar-inner
      [:div.container
        [:a.btn.btn-navbar {:data-toggle "collapse" :data-target ".nav-collapse"}
          [:span.icon-bar]
          [:span.icon-bar]
          [:span.icon-bar]
          [:a.brand {:href "/home"} "Reffonomics"]
          (top-navbar-collapse)]]]])

(defpartial side-navbar []
  [:div.well.sidebar-nav
    [:ul.nav.nav-list
      [:li#snav-0 (link-to "/home" "Home")]
      [:li#snav-1 (link-to "/basic" "Basic Concepts")]
      [:li#snav-2 (link-to "/micro" "Micro Economics")]
      [:li#snav-3 (link-to "/macro" "Macro Economics")]
      [:li#snav-4 (link-to "/resources" "Resources")]
      [:li#snav-5 (link-to "/about" "About")]
      [:li#snav-6 (link-to "/tests" "Tests")]
  ]])

