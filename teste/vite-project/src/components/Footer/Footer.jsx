import Home from '../../assets/img/home.svg';
import Search from '../../assets/img/search.svg';
import Library from '../../assets/img/library.svg';
import styles from './Footer.module.css';


function Footer() {

  return (
    <>
    <footer className={styles.footer}>
    <div className={styles.footerItems}>
        <div><a href='#home' style={{textDecoration:"none", fontFamily:"Inter"}}><img
              alt=""
              src={Home}
              width="30"
              height="30"
              className="d-flex justify-content-center align-items-center flex-direction-column my-1"
            />Inicio</a>
            </div>
        <div><a href='#home' style={{textDecoration:"none", fontFamily:"Inter" }}><img
              alt=""
              src={Search}
              width="30"
              height="30"
              className="d-flex justify-content-center align-items-center flex-direction-column my-1"
            />Pesquisar</a></div>
        <div><a href='#home' style={{textDecoration:"none", fontFamily:"Inter"}}><img
              alt=""
              src={Library}
              width="30"
              height="30"
              className="d-flex justify-content-center align-items-center flex-direction-column my-1"
            />Biblioteca</a></div>
    </div>
      </footer>
    </>
  );
}

export default Footer;
