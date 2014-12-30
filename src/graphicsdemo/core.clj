(ns graphicsdemo.core
  (:require [quil.core :as q]))

(defn setup []
  (q/smooth)
  (q/frame-rate 60)
  (q/background 200)

  (q/stroke (q/random 255) (q/random 255) (q/random 255)) 
  (q/stroke-weight (q/random 10))
  (q/fill (q/random 255) (q/random 255) (q/random 255)) 
  )

(defn draw []
  (q/rect 10 10 (- (q/width) 20) (- (q/height) 20)))

(defn run []
  (q/defsketch example :title "Hello" :setup setup :draw draw :size [320 200]))
