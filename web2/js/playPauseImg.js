var play = true;

function changePlayPauseImage()
{
    if ( play )
        document.getElementById("play-btn").src="../img/pause-button.png";
    else
        document.getElementById("play-btn").src="../img/play-button.png";
    play = !play;
}