(ns Reffonomics-Main.views.common
  (:use [noir.core]
        [hiccup.page]
        [hiccup.element]
        [hiccup.core]
        [Reffonomics-Main.views.nav])
  (:require [noir.response :as resp]))

(defpartial global [title]
  [:head
    [:title (str "Reffonomics - " title)]
    (include-css "/css/bootstrap.css"
                 "/css/responsive.css"
                 "/css/style.css")
    (include-js "/js/jquery.min.js"
                "/js/bootstrap.js"
                "/js/bootstrap-collapse.js")])

(defpartial home [& content]
  (html5
    (global "Home")
    [:body
      (top-navbar)
      [:div.container-fluid content]]
      (javascript-tag "$(window).load(function(){
                        $('#snav-0').addClass('active');
                       });")
  ))

(defpartial basic [& content]
  (html5
    (global "Basic Concepts")
    [:body
      (top-navbar)
      [:div.container-fluid content]]
      (javascript-tag "$(window).load(function(){
                        $('#nav-1').addClass('active');
                        $('#snav-1').addClass('active');
                       });")
  ))

(defpartial micro [& content]
  (html5
    (global "Micro Economics")
    [:body
      (top-navbar)
      [:div.container-fluid content]]
      (javascript-tag "$(window).load(function(){
                        $('#nav-2').addClass('active');
                        $('#snav-2').addClass('active');});")
  ))

(defpartial macro [& content]
  (html5
    (global "Macro Economics")
    [:body
      (top-navbar)
      [:div.container-fluid content]]
      (javascript-tag "$(window).load(function(){
                        $('#nav-3').addClass('active');
                        $('#snav-3').addClass('active');
                       });")
  ))

(defpartial resources [& content]
  (html5
    (global "Resources")
    [:body
      (top-navbar)
      [:div.container-fluid content]]
      (javascript-tag "$(window).load(function(){
                        $('#nav-4').addClass('active');
                        $('#snav-4').addClass('active');
                       });")
  ))

(defpartial about [& content]
  (html5
    (global "About")
    [:body
      (top-navbar)
      [:div.container-fluid content]]
      (javascript-tag "$(window).load(function(){
                        $('#nav-5').addClass('active');
                        $('#snav-5').addClass('active');
                       });")
      (include-js "js/ajax-about.js")
  ))

(defpartial tests [& content]
  (html5
    (global "Tests")
    [:body
      (top-navbar)
      [:div.container-fluid content]]
      (javascript-tag "$(window).load(function(){
                        $('#nav-6').addClass('active');
                        $('#snav-6').addClass('active');
                       });")
  ))
