import Home from '../../assets/img/home.svg';
import Search from '../../assets/img/search.svg';
import Library from '../../assets/img/library.svg';
import styles from './Footer.module.css';


function Footer() {

  return (
    <>
    <footer>
    <div className={styles.footerItems}>
        <div><a href='#home' style={{textDecoration:"none", fontFamily:"Inter"}}><img
              alt=""
              src={Home}
              width="30"
              height="30"
              className={styles.footerItem}
            />Inicio</a>
            </div>
        <div><a href='#home' style={{textDecoration:"none", fontFamily:"Inter" }}><img
              alt=""
              src={Search}
              width="30"
              height="30"
              className={styles.footerItem}
            />Pesquisar</a></div>
        <div><a href='#home' style={{textDecoration:"none", fontFamily:"Inter"}}><img
              alt=""
              src={Library}
              width="30"
              height="30"
              className={styles.footerItem}
            />Biblioteca</a></div>
    </div>
      </footer>
    </>
  );
}

export default Footer;
