
import { useState, React, useEffect } from "react";
import axios from "axios";

const qq = () =>{
    const GetMusicas = async () => {
        let MusicList = [];
        const response = await axios.get("https://api.themoviedb.org/3/movie/550?api_key=c0122b272e9f6f6ec17d20399eb92aec")
        MusicList = response.data.title;
        for (i = 0; i < MusicList.map(); i++) {
            console.log(MusicList);
          } 
    
    };
    useEffect(() => {
        GetMusicas();
    }, []);
}
export default qq;
